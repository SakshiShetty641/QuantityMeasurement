package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightTest {

    @Test
    public void given0Gramand0Gram_ShouldReturnEqual(){
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM,0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM,0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0Gramand1Gram_ShouldReturnNotEqual(){
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM,0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM,1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramandNULLGram_ShouldReturnNotEqual(){
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM,0.0);
        UnitMeasurementSystem gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenType0Gramand0Gram_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM,0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM,1.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void givenReference0Gramand0Gram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM,0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM,1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        boolean compareCheck = kilogram1.compare(gram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000GramAnd1Kilogram_WhenCompared_ShouldReturnEqualUnitMeasurementSystem(){
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        boolean compareCheck = gram1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kilogram_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 1000.0);
        boolean compareCheck = tonne1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000KilogramAnd1Tonne_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 1000.0);
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        boolean compareCheck = tonne1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
        try {
            UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
            UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
            UnitMeasurementSystem expectedSum = new UnitMeasurementSystem(Weight.KILOGRAM, 1001.0);
            UnitMeasurementSystem actualSum = tonne1.addition(gram1, Weight.KILOGRAM);
            Assertions.assertEquals(expectedSum, actualSum);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
