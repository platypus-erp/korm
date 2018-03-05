package product

import (
	"github.com/hexya-erp/hexya/pool"
	"github.com/hexya-erp/hexya/hexya/models"
)

func init(){
	pool.ProductUom().AddFields(map[string]models.FieldDefinition{
		"Name": models.CharField{String: "Unit of Measure", Required: true, Translate: true},
		"Category": models.Many2OneField{RelationModel: pool.ProductUomCateg(), Required: true, OnDelete: models.Cascade,
			Help: ``},
		"Factor": models.FloatField{String: "Ratio", Default: models.DefaultValue(1.0), Required: true,
			Help: ``},
		"FactorInv": models.FloatField{String: "Bigger Ratio", Compute: pool.ProductUom().Methods().ComputeFactorInv(),
			/* readonly True]*/ Required: true,
			Help: `How many times this Unit of Measure is bigger than the reference Unit of Measure in this category:
1 * (this unit) = ratio * (reference unit)`,
			Depends: []string{"Factor"}},
		"Rounding": models.FloatField{String: "Rounding Precision", Default: models.DefaultValue(0.01),
			Required: true, Help: `The computed quantity will be a multiple of this min.
Use 1.0 for a Unit of Measure that cannot be further split, such as a piece.`},
		"Active": models.BooleanField{Default: models.DefaultValue(true),
			Help: "Uncheck the active field to disable a unit of measure without deleting it."},
		"UomType": models.SelectionField{String: "Type", Selection: types.Selection{
			"bigger":    "Bigger than the reference Unit of Measure",
			"reference": "Reference Unit of Measure for this category",
			"smaller":   "Smaller than the reference Unit of Measure",
		}, Default: models.DefaultValue("reference"), Required: true,
			OnChange: pool.ProductUom().Methods().OnchangeUomType()},
	})

	pool.ProductUom().AddSQLConstraint("FactorGtZero", "CHECK (factor!=0)", "The conversion ratio for a unit of measure cannot be 0!")
	pool.ProductUom().AddSQLConstraint("RoundingGtZero", "CHECK (rounding>0)", "The rounding precision must be greater than 0!")

	pool.ProductUom().Methods().ComputeFactorInv().DeclareMethod(
		`ComputeFactorInv computes the inverse factor`,
		func(rs pool.ProductUomSet) (*pool.ProductUomData, []models.FieldNamer) {
			var factorInv float64
			if rs.Factor() != 0 {
				factorInv = 1 / rs.Factor()
			}
			return &pool.ProductUomData{
				FactorInv: factorInv,
			}, []models.FieldNamer{pool.ProductUom().FactorInv()}
		})

	pool.ProductUom().Methods().OnchangeUomType().DeclareMethod(
		`OnchangeUomType updates factor when the UoM type is changed`,
		func(rs pool.ProductUomSet) (*pool.ProductUomData, []models.FieldNamer) {
			if rs.UomType() == "reference" {
				return &pool.ProductUomData{
					Factor: 1,
				}, []models.FieldNamer{pool.ProductUom().Factor()}
			}
			return new(pool.ProductUomData), []models.FieldNamer{}

		})
}
