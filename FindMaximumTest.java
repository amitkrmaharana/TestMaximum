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
}