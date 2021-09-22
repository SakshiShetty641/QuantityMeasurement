package quantitymeasurement;

/**
 * Purpose - To simulate a Quantity Management System
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-09-20
 */
public class Length {
    enum Unit {FEET, INCH}

    private static final double FEET_TO_INCH = 12;

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value * FEET_TO_INCH) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
