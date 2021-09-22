package quantitymeasurement;

/**
 * Purpose - To simulate a Quantity Management System
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-09-20
 */
public class Length {
    enum Unit {FEET, INCH, YARD, CENTIMETER};

    private static final double YARD_TO_FEET = 3 ;
    private static final double FEET_TO_INCH = 12;
    private static final double YARD_TO_INCH = 36;
    private static final double INCH_TO_CM = 2.5;

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
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_FEET) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * YARD_TO_FEET, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_INCH) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * YARD_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.CENTIMETER) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value * INCH_TO_CM, that.value) == 0;
        if (this.unit.equals(Unit.CENTIMETER) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value * INCH_TO_CM) == 0;
        return false;
    }

    public Length sumOfLength(Length that) {
        double sum = 0.0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            sum = this.value + that.value;
        else if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            sum = this.value * FEET_TO_INCH + that.value;
        else if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            sum = this.value * FEET_TO_INCH + that.value * FEET_TO_INCH;
        else if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTIMETER))
            sum = this.value + that.value / INCH_TO_CM;
        return new Length(Unit.INCH, sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
