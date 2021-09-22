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
        Assertions.assertEquals(gram1, gram2);
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
}
