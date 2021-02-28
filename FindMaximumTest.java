import org.junit.Assert;
import org.junit.Test;


public class FindMaximumTest {
    static FindMaximum findMax;
    @Test
    //Given 3 numbers First Number is Maximum
    public <T>void given3Numbers1stIsMaximum() {
        Integer[] arrayInt = {10,5,9};
        Comparable max = new FindMaximum(arrayInt).findMaximumBetween3Values();
        Assert.assertEquals(10, max);
    }
    @Test
    //Given 3 numbers Second Number is Maximum
    public void given3Numbers2ndIsMaximum() {
        Integer[] arrayInt = {5,10,9};
        Comparable max = new FindMaximum(arrayInt).findMaximumBetween3Values();
        Assert.assertEquals(10, max);
    }
    @Test
    //Given 3 numbers Third Number is Maximum
    public void given3Numbers3rdIsMaximum() {
        Integer[] arrayInt = {9,5,10};
        Comparable max = new FindMaximum(arrayInt).findMaximumBetween3Values();
        Assert.assertEquals(10, max);
    }
    @Test
    //Given 3 float values First float values is Maximum
    public void given3FloatValue1stIsMaximum() {
        Float[] arrayFloat = {10f, 5f, 9f};
        Comparable max = new FindMaximum(arrayFloat).findMaximumBetween3Values();
        Assert.assertEquals(10f, max);
    }
    @Test
    //Given 3 float values Second float values is Maximum
    public void given3FloatValue2ndIsMaximum() {
        Float[] arrayFloat = {5f,10f,9f};
        Comparable max = new FindMaximum(arrayFloat).findMaximumBetween3Values();
        Assert.assertEquals(10f, max);
    }
    @Test
    //Given 3 float values  Third float values is Maximum
    public void given3FloatValue3rdIsMaximum() {
        Float[] arrayFloat = {9f,5f,10f};
        Comparable max = new FindMaximum(arrayFloat).findMaximumBetween3Values();
        Assert.assertEquals(10f, max);
    }
    @Test
    //Given 3 float values First float values is Maximum
    public void given3String1stIsMaximum() {
        String[] arrayString = {"Peach","Banana","Apple"};
        Comparable max = new FindMaximum(arrayString).findMaximumBetween3Values();
        Assert.assertEquals("Peach", max);
    }
    @Test
    //Given 3 float values Second float values is Maximum
    public void given3String2ndIsMaximum() {
        String[] arrayString = {"Banana","Peach","Apple"};
        Comparable max = new FindMaximum(arrayString).findMaximumBetween3Values();
        Assert.assertEquals("Peach", max);
    }
    @Test
    //Given 3 float values  Third float values is Maximum
    public void given3String3rdIsMaximum() {
        String[] arrayString = {"Banana","Apple","Peach"};
        Comparable max = new FindMaximum(arrayString).findMaximumBetween3Values();
        Assert.assertEquals("Peach", max);
    }
}
