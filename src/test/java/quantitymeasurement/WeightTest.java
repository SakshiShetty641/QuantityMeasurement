package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightTest {

    @Test
    public void given0Gramand0Gram_ShouldReturnEqual(){
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM,0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0Gramand1Gram_ShouldReturnNotEqual(){
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM,1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramandNULLGram_ShouldReturnNotEqual(){
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenType0Gramand0Gram_ShouldReturnEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM,1.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void givenReference0Gramand0Gram_ShouldReturnNotEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM,1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        Weight kilogram1 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight gram1 = new Weight(Weight.Unit.GRAM, 1000.0);
        boolean compareCheck = kilogram1.compare(gram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000GramAnd1Kilogram_WhenCompared_ShouldReturnEqualWeight(){
        Weight gram1 = new Weight(Weight.Unit.GRAM, 1000.0);
        Weight kilogram1 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        boolean compareCheck = gram1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 1.0);
        Weight kilogram1 = new Weight(Weight.Unit.KILOGRAM, 1000.0);
        boolean compareCheck = tonne1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000KilogramAnd1Tonne_WhenCompared_ShouldReturnEqualWeight() {
        Weight kilogram1 = new Weight(Weight.Unit.KILOGRAM, 1000.0);
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 1.0);
        boolean compareCheck = tonne1.compare(kilogram1);
        Assertions.assertTrue(compareCheck);
    }
}
