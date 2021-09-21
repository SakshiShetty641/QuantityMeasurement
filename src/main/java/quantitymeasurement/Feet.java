package quantitymeasurement;

/**
 * Purpose - To simulate a Quantity Management System
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-09-20
 */
public class Feet {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    public double feetToInchConversion(){
        return value * 12;
    }

    public double feetToYardConversion(){
        return value / 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}
