class ProductPackaging(models.Model):
    _name = "product.packaging"
    _description = "Packaging"
    _order = 'sequence'

    name = fields.Char('Packaging Type', required=True)
    sequence = fields.Integer('Sequence', default=1, help="The first in the sequence is the default one.")
    product_tmpl_id = fields.Many2one('product.template', string='Product')
    qty = fields.Float('Quantity per Package', help="The total number of products you can have per pallet or box.")