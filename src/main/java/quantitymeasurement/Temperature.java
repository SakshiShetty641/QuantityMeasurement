package quantitymeasurement;

import java.util.function.Function;

public enum Temperature implements MeasurementUnits {
    FAHRENHEIT(true), CELSIUS(false);

    private final Function<Double, Double> baseUnitConversion;
    private final Function<Double, Double> FahrenheitToCelsius = (Double degF) -> (degF - 32) * 5 / 9;
    private final Function<Double, Double> CelsiusToFahrenheit =(Double degC) -> degC;

    Temperature(boolean temp) {
        if (temp) this.baseUnitConversion = FahrenheitToCelsius;
        else this.baseUnitConversion = CelsiusToFahrenheit ;
    }

    @Override
    public double convertToBaseUnit(UnitMeasurementSystem units) {
        return baseUnitConversion.apply(units.value);
    }

    @Override
    public boolean supportAddition() {
        return true;
    }
}

