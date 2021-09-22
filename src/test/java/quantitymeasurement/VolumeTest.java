package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeTest {

    @Test
    public void given0Gallonand0Gallon_ShouldReturnEqual(){
        Volume gallon1 = new Volume(Volume.Unit.GALLON,0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON,0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0Gallonand1Gallon_ShouldReturnNotEqual(){
        Volume gallon1 = new Volume(Volume.Unit.GALLON,0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON,1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonandNullGallon_ShouldReturnNotEqual(){
        Volume gallon1 = new Volume(Volume.Unit.GALLON,0.0);
        Volume gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenType0Gallonand1Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON,0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON,1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void givenReference0Gallonand1Gallon_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON,0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON,1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0Litreand0Litre_ShouldReturnEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE,0.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE,0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0Litreand1Litre_ShouldReturnNotEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE,0.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE,1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0LitreandNullLitre_ShouldReturnNotEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE,0.0);
        Volume litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }
}
