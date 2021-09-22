package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNullFeet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0Feetand1Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenReference0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchandNullInch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0Inchand1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void givenReference0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Feetand0Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqualLength(){
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqualLength(){
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assertions.assertTrue(compareCheck);
    }
}