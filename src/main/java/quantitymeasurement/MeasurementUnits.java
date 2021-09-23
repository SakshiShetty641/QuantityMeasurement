package quantitymeasurement;

public interface MeasurementUnits {
    double convertToBaseUnit(UnitMeasurementSystem units);
    boolean supportAddition();
}
