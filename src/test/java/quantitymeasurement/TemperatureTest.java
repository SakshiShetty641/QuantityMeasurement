package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureTest {

    @Test
    void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualTemperature() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temperature1, temperature2);
    }

    @Test
    void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqualTemperature() {
        Temperature temperature21 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature22 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temperature21, temperature22);
    }

    @Test
    void given0FahrenheitAndNull_ShouldReturnNotEqualTemperature() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = null;
        Assertions.assertNotEquals(temperature1, temperature2);
    }

    @Test
    public void givenType0FahrenheitAnd1Fahrenheit_ShouldReturnEqual() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temperature1.getClass(), temperature2.getClass());
    }

    @Test
    public void givenReference0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqual() {
        Temperature temperature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temperature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temperature1, temperature2);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnEqualTemperature() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }
}
