package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureTest {

    @Test
    void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem temperature1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem temperature2 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temperature1, temperature2);
    }

    @Test
    void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqualUnitMeasurementSystem() {
        UnitMeasurementSystem temperature1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem temperature2 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temperature1, temperature2);
    }

    @Test
    void given0FahrenheitAndNull_ShouldReturnNotEqualUnitMeasurementSystem() {
        UnitMeasurementSystem temperature1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem temperature2 = null;
        Assertions.assertNotEquals(temperature1, temperature2);
    }

    @Test
    public void givenType0FahrenheitAnd1Fahrenheit_ShouldReturnEqual() {
        UnitMeasurementSystem temperature1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem temperature2 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temperature1.getClass(), temperature2.getClass());
    }

    @Test
    public void givenReference0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqual() {
        UnitMeasurementSystem temperature1 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        UnitMeasurementSystem temperature2 = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temperature1, temperature2);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem fahrenheit = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 212.0);
        UnitMeasurementSystem celsius = new UnitMeasurementSystem(Temperature.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }
}
