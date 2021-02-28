import org.junit.Assert;
import org.junit.Test;


public class FindMaximumTest {
    static FindMaximum findMax = new FindMaximum();
    @Test
    //Given 3 numbers First Number is Maximum
    public void given3Numbers1stIsMaximum() {
        int[] arrayInt = {10,5,9};
        Assert.assertEquals(10, findMax.findMaximumBetween3Integer(arrayInt));
    }
    @Test
    //Given 3 numbers Second Number is Maximum
    public void given3Numbers2ndIsMaximum() {
        int[] arrayInt = {5,10,9};
        Assert.assertEquals(10, findMax.findMaximumBetween3Integer(arrayInt));
    }
    @Test
    //Given 3 numbers Third Number is Maximum
    public void given3Numbers3rdIsMaximum() {
        int[] arrayInt = {9,5,10};
        Assert.assertEquals(10, findMax.findMaximumBetween3Integer(arrayInt));
    }
    @Test
    //Given 3 float values First float values is Maximum
    public void given3FloatValue1stIsMaximum() {
        float[] arrayFloat = {10, 5, 9};
        Assert.assertEquals(10, findMax.findMaximumBetween3FloatValues(arrayFloat), 0);
    }
    @Test
    //Given 3 float values Second float values is Maximum
    public void given3FloatValue2ndIsMaximum() {
        float[] arrayFloat = {5,10,9};
        Assert.assertEquals(10, findMax.findMaximumBetween3FloatValues(arrayFloat), 0);
    }
    @Test
    //Given 3 float values  Third float values is Maximum
    public void given3FloatValue3rdIsMaximum() {
        float[] arrayFloat = {9,5,10};
        Assert.assertEquals(10, findMax.findMaximumBetween3FloatValues(arrayFloat), 0);
    }
}