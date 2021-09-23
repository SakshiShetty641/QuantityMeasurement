package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeTest {

    @Test
    public void given0Gallonand0Gallon_ShouldReturnEqual(){
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON,0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON,0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0Gallonand1Gallon_ShouldReturnNotEqual(){
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON,0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON,1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonandNullGallon_ShouldReturnNotEqual(){
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON,0.0);
        UnitMeasurementSystem gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenType0Gallonand1Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON,0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON,1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void givenReference0Gallonand1Gallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON,0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON,1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0Litreand0Litre_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE,0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE,0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0Litreand1Litre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE,0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE,1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0LitreandNullLitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE,0.0);
        UnitMeasurementSystem litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0GallonAnd0Litre_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqualUnitMeasurementSystem() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1GallonAnd3point78Litre_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given3point78LitreAnd1Gallon_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        boolean compareCheck = gallon1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0LiterAnd0MilliLitre_WhenCompared_ShouldReturnNotEqualUnitMeasurementSystem() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        boolean compareCheck = litre1.compare(millilitre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1LiterAnd1000MilliLitre_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        boolean compareCheck = litre1.compare(millilitre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLitreAnd1Litre_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        boolean compareCheck = millilitre1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3point78Litre_WhenAdded_ShouldReturn7point57Liter() {
        try {
            UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
            UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 3.78);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Volume.LITRE, 7.56);
            UnitMeasurementSystem actual = gallon1.addition(litre1, Volume.LITRE);
            Assertions.assertEquals(expected, actual);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void given1LitreAnd1000MilliLitre_WhenAdded_ShouldReturn2Liter() {
        try {
            UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
            UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
            UnitMeasurementSystem expected = new UnitMeasurementSystem(Volume.LITRE, 2.0);
            UnitMeasurementSystem actual = litre1.addition(millilitre1, Volume.LITRE);
            Assertions.assertEquals(expected, actual);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
