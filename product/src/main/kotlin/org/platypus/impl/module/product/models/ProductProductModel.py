class ProductProduct(models.Model):
    _name = "product.product"
    _description = "Product"
    _inherits = {'product.template': 'product_tmpl_id'}
    _inherit = ['mail.thread']
    _order = 'default_code, name, id'

    price = fields.Float(
        'Price', compute='_compute_product_price',
        digits=dp.get_precision('Product Price'), inverse='_set_product_price')
    price_extra = fields.Float(
        'Variant Price Extra', compute='_compute_product_price_extra',
        digits=dp.get_precision('Product Price'),
        help="This is the sum of the extra price of all attributes")
    lst_price = fields.Float(
        'Sale Price', compute='_compute_product_lst_price',
        digits=dp.get_precision('Product Price'), inverse='_set_product_lst_price',
        help="The sale price is managed from the product template. Click on the 'Variant Prices' button to set the extra attribute prices.")

    default_code = fields.Char('Internal Reference', index=True)
    code = fields.Char('Internal Reference', compute='_compute_product_code')
    partner_ref = fields.Char('Customer Ref', compute='_compute_partner_ref')

    active = fields.Boolean(
        'Active', default=True,
        help="If unchecked, it will allow you to hide the product without removing it.")
    product_tmpl_id = fields.Many2one(
        'product.template', 'Product Template',
        auto_join=True, index=True, ondelete="cascade", required=True)
    barcode = fields.Char(
        'Barcode', copy=False, oldname='ean13',
        help="International Article Number used for product identification.")
    attribute_value_ids = fields.Many2many(
        'product.attribute.value', string='Attributes', ondelete='restrict')
    # image: all image fields are base64 encoded and PIL-supported
    image_variant = fields.Binary(
        "Variant Image", attachment=True,
        help="This field holds the image used as image for the product variant, limited to 1024x1024px.")
    image = fields.Binary(
        "Big-sized image", compute='_compute_images', inverse='_set_image',
        help="Image of the product variant (Big-sized image of product template if false). It is automatically "
             "resized as a 1024x1024px image, with aspect ratio preserved.")
    image_small = fields.Binary(
        "Small-sized image", compute='_compute_images', inverse='_set_image_small',
        help="Image of the product variant (Small-sized image of product template if false).")
    image_medium = fields.Binary(
        "Medium-sized image", compute='_compute_images', inverse='_set_image_medium',
        help="Image of the product variant (Medium-sized image of product template if false).")

    standard_price = fields.Float(
        'Cost', company_dependent=True,
        digits=dp.get_precision('Product Price'),
        groups="base.group_user",
        help="Cost of the product template used for standard stock valuation in accounting and used as a base price on purchase orders. "
             "Expressed in the default unit of measure of the product.")
    volume = fields.Float('Volume', help="The volume in m3.")
    weight = fields.Float(
        'Weight', digits=dp.get_precision('Stock Weight'),
        help="The weight of the contents in Kg, not including any packaging, etc.")

    pricelist_item_ids = fields.Many2many(
        'product.pricelist.item', 'Pricelist Items', compute='_get_pricelist_items')

    _sql_constraints = [
        ('barcode_uniq', 'unique(barcode)', _("A barcode can only be assigned to one product !")),
    ]

    def _compute_product_price(self):
        prices = {}
        pricelist_id_or_name = self._context.get('pricelist')
        if pricelist_id_or_name:
            pricelist = None
            partner = self._context.get('partner', False)
            quantity = self._context.get('quantity', 1.0)

            # Support context pricelists specified as display_name or ID for compatibility
            if isinstance(pricelist_id_or_name, basestring):
                pricelist_name_search = self.env['product.pricelist'].name_search(pricelist_id_or_name, operator='=', limit=1)
                if pricelist_name_search:
                    pricelist = self.env['product.pricelist'].browse([pricelist_name_search[0][0]])
            elif isinstance(pricelist_id_or_name, (int, long)):
                pricelist = self.env['product.pricelist'].browse(pricelist_id_or_name)

            if pricelist:
                quantities = [quantity] * len(self)
                partners = [partner] * len(self)
                prices = pricelist.get_products_price(self, quantities, partners)

        for product in self:
            product.price = prices.get(product.id, 0.0)

    def _set_product_price(self):
        for product in self:
            if self._context.get('uom'):
                value = self.env['product.uom'].browse(self._context['uom'])._compute_price(product.price, product.uom_id)
            else:
                value = product.price
            value -= product.price_extra
            product.write({'list_price': value})

    def _set_product_lst_price(self):
        for product in self:
            if self._context.get('uom'):
                value = self.env['product.uom'].browse(self._context['uom'])._compute_price(product.lst_price, product.uom_id)
            else:
                value = product.lst_price
            value -= product.price_extra
            product.write({'list_price': value})

    @api.depends('attribute_value_ids.price_ids.price_extra', 'attribute_value_ids.price_ids.product_tmpl_id')
    def _compute_product_price_extra(self):
        # TDE FIXME: do a real multi and optimize a bit ?
        for product in self:
            price_extra = 0.0
            for attribute_price in product.mapped('attribute_value_ids.price_ids'):
                if attribute_price.product_tmpl_id == product.product_tmpl_id:
                    price_extra += attribute_price.price_extra
            product.price_extra = price_extra

    @api.depends('list_price', 'price_extra')
    def _compute_product_lst_price(self):
        to_uom = None
        if 'uom' in self._context:
            to_uom = self.env['product.uom'].browse([self._context['uom']])

        for product in self:
            if to_uom:
                list_price = product.uom_id._compute_price(product.list_price, to_uom)
            else:
                list_price = product.list_price
            product.lst_price = list_price + product.price_extra

    @api.one
    def _compute_product_code(self):
        for supplier_info in self.seller_ids:
            if supplier_info.name.id == self._context.get('partner_id'):
                self.code = supplier_info.product_code or self.default_code
        else:
            self.code = self.default_code

    @api.one
    def _compute_partner_ref(self):
        for supplier_info in self.seller_ids:
            if supplier_info.name.id == self._context.get('partner_id'):
                product_name = supplier_info.product_name or self.default_code
        else:
            product_name = self.name
        self.partner_ref = '%s%s' % (self.code and '[%s] ' % self.code or '', product_name)

    @api.one
    @api.depends('image_variant', 'product_tmpl_id.image')
    def _compute_images(self):
        if self._context.get('bin_size'):
            self.image_medium = self.image_variant
            self.image_small = self.image_variant
            self.image = self.image_variant
        else:
            resized_images = tools.image_get_resized_images(self.image_variant, return_big=True, avoid_resize_medium=True)
            self.image_medium = resized_images['image_medium']
            self.image_small = resized_images['image_small']
            self.image = resized_images['image']
        if not self.image_medium:
            self.image_medium = self.product_tmpl_id.image_medium
        if not self.image_small:
            self.image_small = self.product_tmpl_id.image_small
        if not self.image:
            self.image = self.product_tmpl_id.image

    @api.one
    def _set_image(self):
        self._set_image_value(self.image)

    @api.one
    def _set_image_medium(self):
        self._set_image_value(self.image_medium)

    @api.one
    def _set_image_small(self):
        self._set_image_value(self.image_small)

    @api.one
    def _set_image_value(self, value):
        image = tools.image_resize_image_big(value)
        if self.product_tmpl_id.image:
            self.image_variant = image
        else:
            self.product_tmpl_id.image = image

    @api.one
    def _get_pricelist_items(self):
        self.pricelist_item_ids = self.env['product.pricelist.item'].search([
            '|',
            ('product_id', '=', self.id),
            ('product_tmpl_id', '=', self.product_tmpl_id.id)]).ids

    @api.constrains('attribute_value_ids')
    def _check_attribute_value_ids(self):
        for product in self:
            attributes = self.env['product.attribute']
            for value in product.attribute_value_ids:
                if value.attribute_id in attributes:
                    raise ValidationError(_('Error! It is not allowed to choose more than one value for a given attribute.'))
                if value.attribute_id.create_variant:
                    attributes |= value.attribute_id
        return True

    @api.onchange('uom_id', 'uom_po_id')
    def _onchange_uom(self):
        if self.uom_id and self.uom_po_id and self.uom_id.category_id != self.uom_po_id.category_id:
            self.uom_po_id = self.uom_id

    @api.model
    def create(self, vals):
        product = super(ProductProduct, self.with_context(create_product_product=True)).create(vals)
        # When a unique variant is created from tmpl then the standard price is set by _set_standard_price
        if not (self.env.context.get('create_from_tmpl') and len(product.product_tmpl_id.product_variant_ids) == 1):
            product._set_standard_price(vals.get('standard_price') or 0.0)
        return product

    @api.multi
    def write(self, values):
        ''' Store the standard price change in order to be able to retrieve the cost of a product for a given date'''
        res = super(ProductProduct, self).write(values)
        if 'standard_price' in values:
            self._set_standard_price(values['standard_price'])
        return res

    @api.multi
    def unlink(self):
        unlink_products = self.env['product.product']
        unlink_templates = self.env['product.template']
        for product in self:
            # Check if product still exists, in case it has been unlinked by unlinking its template
            if not product.exists():
                continue
            # Check if the product is last product of this template
            other_products = self.search([('product_tmpl_id', '=', product.product_tmpl_id.id), ('id', '!=', product.id)])
            if not other_products:
                unlink_templates |= product.product_tmpl_id
            unlink_products |= product
        res = super(ProductProduct, unlink_products).unlink()
        # delete templates after calling super, as deleting template could lead to deleting
        # products due to ondelete='cascade'
        unlink_templates.unlink()
        return res

    @api.multi
    def copy(self, default=None):
        # TDE FIXME: clean context / variant brol
        if default is None:
            default = {}
        if self._context.get('variant'):
            # if we copy a variant or create one, we keep the same template
            default['product_tmpl_id'] = self.product_tmpl_id.id
        elif 'name' not in default:
            default['name'] = self.name

        return super(ProductProduct, self).copy(default=default)

    @api.model
    def search(self, args, offset=0, limit=None, order=None, count=False):
        # TDE FIXME: strange
        if self._context.get('search_default_categ_id'):
            args.append((('categ_id', 'child_of', self._context['search_default_categ_id'])))
        return super(ProductProduct, self).search(args, offset=offset, limit=limit, order=order, count=count)

    @api.multi
    def name_get(self):
        # TDE: this could be cleaned a bit I think

        def _name_get(d):
            name = d.get('name', '')
            code = self._context.get('display_default_code', True) and d.get('default_code', False) or False
            if code:
                name = '[%s] %s' % (code,name)
            return (d['id'], name)

        partner_id = self._context.get('partner_id')
        if partner_id:
            partner_ids = [partner_id, self.env['res.partner'].browse(partner_id).commercial_partner_id.id]
        else:
            partner_ids = []

        # all user don't have access to seller and partner
        # check access and use superuser
        self.check_access_rights("read")
        self.check_access_rule("read")

        result = []
        for product in self.sudo():
            # display only the attributes with multiple possible values on the template
            variable_attributes = product.attribute_line_ids.filtered(lambda l: len(l.value_ids) > 1).mapped('attribute_id')
            variant = product.attribute_value_ids._variant_name(variable_attributes)

            name = variant and "%s (%s)" % (product.name, variant) or product.name
            sellers = []
            if partner_ids:
                sellers = [x for x in product.seller_ids if (x.name.id in partner_ids) and (x.product_id == product)]
                if not sellers:
                    sellers = [x for x in product.seller_ids if (x.name.id in partner_ids) and not x.product_id]
            if sellers:
                for s in sellers:
                    seller_variant = s.product_name and (
                        variant and "%s (%s)" % (s.product_name, variant) or s.product_name
                    ) or False
                    mydict = {
                        'id': product.id,
                        'name': seller_variant or name,
                        'default_code': s.product_code or product.default_code,
                    }
                    temp = _name_get(mydict)
                    if temp not in result:
                        result.append(temp)
            else:
                mydict = {
                    'id': product.id,
                    'name': name,
                    'default_code': product.default_code,
                }
                result.append(_name_get(mydict))
        return result

    @api.model
    def name_search(self, name='', args=None, operator='ilike', limit=100):
        if not args:
            args = []
        if name:
            positive_operators = ['=', 'ilike', '=ilike', 'like', '=like']
            products = self.env['product.product']
            if operator in positive_operators:
                products = self.search([('default_code', '=', name)] + args, limit=limit)
                if not products:
                    products = self.search([('barcode', '=', name)] + args, limit=limit)
            if not products and operator not in expression.NEGATIVE_TERM_OPERATORS:
                # Do not merge the 2 next lines into one single search, SQL search performance would be abysmal
                # on a database with thousands of matching products, due to the huge merge+unique needed for the
                # OR operator (and given the fact that the 'name' lookup results come from the ir.translation table
                # Performing a quick memory merge of ids in Python will give much better performance
                products = self.search(args + [('default_code', operator, name)], limit=limit)
                if not limit or len(products) < limit:
                    # we may underrun the limit because of dupes in the results, that's fine
                    limit2 = (limit - len(products)) if limit else False
                    products += self.search(args + [('name', operator, name), ('id', 'not in', products.ids)], limit=limit2)
            elif not products and operator in expression.NEGATIVE_TERM_OPERATORS:
                products = self.search(args + ['&', ('default_code', operator, name), ('name', operator, name)], limit=limit)
            if not products and operator in positive_operators:
                ptrn = re.compile('(\[(.*?)\])')
                res = ptrn.search(name)
                if res:
                    products = self.search([('default_code', '=', res.group(2))] + args, limit=limit)
            # still no results, partner in context: search on supplier info as last hope to find something
            if not products and self._context.get('partner_id'):
                suppliers = self.env['product.supplierinfo'].search([
                    ('name', '=', self._context.get('partner_id')),
                    '|',
                    ('product_code', operator, name),
                    ('product_name', operator, name)])
                if suppliers:
                    products = self.search([('product_tmpl_id.seller_ids', 'in', suppliers.ids)], limit=limit)
        else:
            products = self.search(args, limit=limit)
        return products.name_get()

    @api.model
    def view_header_get(self, view_id, view_type):
        res = super(ProductProduct, self).view_header_get(view_id, view_type)
        if self._context.get('categ_id'):
            return _('Products: ') + self.env['product.category'].browse(self._context['categ_id']).name
        return res

    @api.multi
    def open_product_template(self):
        """ Utility method used to add an "Open Template" button in product views """
        self.ensure_one()
        return {'type': 'ir.actions.act_window',
                'res_model': 'product.template',
                'view_mode': 'form',
                'res_id': self.product_tmpl_id.id,
                'target': 'new'}

    @api.multi
    def _select_seller(self, partner_id=False, quantity=0.0, date=None, uom_id=False):
        self.ensure_one()
        if date is None:
            date = fields.Date.today()
        res = self.env['product.supplierinfo']
        for seller in self.seller_ids:
            # Set quantity in UoM of seller
            quantity_uom_seller = quantity
            if quantity_uom_seller and uom_id and uom_id != seller.product_uom:
                quantity_uom_seller = uom_id._compute_quantity(quantity_uom_seller, seller.product_uom)

            if seller.date_start and seller.date_start > date:
                continue
            if seller.date_end and seller.date_end < date:
                continue
            if partner_id and seller.name not in [partner_id, partner_id.parent_id]:
                continue
            if quantity_uom_seller < seller.min_qty:
                continue
            if seller.product_id and seller.product_id != self:
                continue

            res |= seller
            break
        return res

    @api.multi
    def price_compute(self, price_type, uom=False, currency=False, company=False):
        # TDE FIXME: delegate to template or not ? fields are reencoded here ...
        # compatibility about context keys used a bit everywhere in the code
        if not uom and self._context.get('uom'):
            uom = self.env['product.uom'].browse(self._context['uom'])
        if not currency and self._context.get('currency'):
            currency = self.env['res.currency'].browse(self._context['currency'])

        products = self
        if price_type == 'standard_price':
            # standard_price field can only be seen by users in base.group_user
            # Thus, in order to compute the sale price from the cost for users not in this group
            # We fetch the standard price as the superuser
            products = self.with_context(force_company=company and company.id or self._context.get('force_company', self.env.user.company_id.id)).sudo()

        prices = dict.fromkeys(self.ids, 0.0)
        for product in products:
            prices[product.id] = product[price_type] or 0.0
            if price_type == 'list_price':
                prices[product.id] += product.price_extra

            if uom:
                prices[product.id] = product.uom_id._compute_price(prices[product.id], uom)

            # Convert from current user company currency to asked one
            # This is right cause a field cannot be in more than one currency
            if currency:
                prices[product.id] = product.currency_id.compute(prices[product.id], currency)

        return prices


    # compatibility to remove after v10 - DEPRECATED
    @api.multi
    def price_get(self, ptype='list_price'):
        return self.price_compute(ptype)

    @api.multi
    def _set_standard_price(self, value):
        ''' Store the standard price change in order to be able to retrieve the cost of a product for a given date'''
        PriceHistory = self.env['product.price.history']
        for product in self:
            PriceHistory.create({
                'product_id': product.id,
                'cost': value,
                'company_id': self._context.get('force_company', self.env.user.company_id.id),
            })

    @api.multi
    def get_history_price(self, company_id, date=None):
        history = self.env['product.price.history'].search([
            ('company_id', '=', company_id),
            ('product_id', 'in', self.ids),
            ('datetime', '<=', date or fields.Datetime.now())], order='datetime desc,id desc', limit=1)
        return history.cost or 0.0

    def _need_procurement(self):
        # When sale/product is installed alone, there is no need to create procurements. Only
        # sale_stock and sale_service need procurements
        return False

