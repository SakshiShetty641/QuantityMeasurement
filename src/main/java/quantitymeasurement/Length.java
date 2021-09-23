package quantitymeasurement;

/**
 * Purpose - To simulate a Quantity Management System
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-09-20
 */
public enum Length implements MeasurementUnits {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4);

    public final double conversionValue;

    Length(double conversionValue) {
        this.conversionValue = conversionValue;
    }


    @Override
    public double convertToBaseUnit(UnitMeasurementSystem units) {
        return (units.value * conversionValue);
    }

    @Override
    public boolean supportAddition() {
        return true;
    }
}