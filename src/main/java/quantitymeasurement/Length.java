package quantitymeasurement;

/**
 * Purpose - To simulate a Quantity Management System
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-09-20
 */
public class Length {
    enum Unit{Feet, Inch};

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public double feetToInchConversion(){
        return value * 12;
    }

    public double inchToFeetConversion(){
        return value / 12;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
