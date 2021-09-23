package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNullFeet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,0.0);
        UnitMeasurementSystem feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0Feetand1Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET,1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenReference0Feetand1Feet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchandNullInch_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,0.0);
        UnitMeasurementSystem inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0Inchand1Inch_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH,1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void givenReference0Inchand1Inch_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Feetand0Inch_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,0.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqualUnitMeasurementSystem(){
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqualUnitMeasurementSystem(){
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,1.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,12.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,1.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH,1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Yardand0Yard_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD,0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD,0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Yardand1Yard_ShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD,0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD,1.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0YardandNullYard_ShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD,0.0);
        UnitMeasurementSystem yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given3Feetand1Yard_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,3.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD,1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Yard_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,1.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD,1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Inchand1Yard_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,1.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD,1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Yardand36Inch_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD,1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36Inchand1Yard_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH,36.0);
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD,1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Yardand3Feet_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD,1.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET,3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Centimeterand0Centimeter_ShouldReturnEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Centimeterand1Centimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.CENTIMETER,1.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0CentimeterandNullCentimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        UnitMeasurementSystem centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER, 5.0);
        boolean compareCheck = inch1.compare(centimeter1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given5CentimeterAnd2Inch_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem centimeter1  = new UnitMeasurementSystem(Length.CENTIMETER, 5.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        boolean compareCheck = centimeter1 .compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        try {
            UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
            UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 2.0);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Length.INCH, 4.0);
            UnitMeasurementSystem actual = inch1.addition(inch2, Length.INCH);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        try {
            UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
            UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Length.INCH, 14.0);
            UnitMeasurementSystem actual = feet1.addition(inch1, Length.INCH);
            Assertions.assertEquals(expected, actual);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        try {
            UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
            UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Length.INCH, 24.0);
            UnitMeasurementSystem actual = feet1.addition(feet2, Length.INCH);
            Assertions.assertEquals(expected, actual);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void given2Inch2point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        try {
            UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
            UnitMeasurementSystem centimeter = new UnitMeasurementSystem(Length.CENTIMETER, 2.5);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Length.INCH, 3.0);
            UnitMeasurementSystem actual = inch.addition(centimeter, Length.INCH);
            Assertions.assertEquals(expected, actual);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}