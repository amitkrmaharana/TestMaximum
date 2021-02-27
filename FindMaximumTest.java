import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FindMaximumTest {
    static FindMaximum findMax = new FindMaximum();
    static ArrayList<Integer> myIntegerList =  new ArrayList<>();
    static ArrayList<Float> myFloatList = new ArrayList<>();
    static ArrayList<String> myStringList = new ArrayList<>();
    @Test
    //Given 3 numbers First Number is Maximum
    public void given3Numbers1stIsMaximum() {
        myIntegerList.add(10);//Adding the values to the arraylist
        myIntegerList.add(5);
        myIntegerList.add(9);
        Assert.assertEquals(10, findMax.findMaximumBetween3Values(myIntegerList));
    }
    @Test
    //Given 3 numbers Second Number is Maximum
    public void given3Numbers2ndIsMaximum() {
        myIntegerList.add(5);
        myIntegerList.add(10);
        myIntegerList.add(9);
        Assert.assertEquals(10, findMax.findMaximumBetween3Values(myIntegerList));
    }
    @Test
    //Given 3 numbers Third Number is Maximum
    public void given3Numbers3rdIsMaximum() {
        myIntegerList.add(5);
        myIntegerList.add(9);
        myIntegerList.add(10);
        Assert.assertEquals(10, findMax.findMaximumBetween3Values(myIntegerList));
    }
    @Test
    //Given 3 float values First float values is Maximum
    public void given3FloatValue1stIsMaximum() {
        myFloatList.add(10f);//Adding the values to the arraylist
        myFloatList.add(5f);
        myFloatList.add(9f);
        Assert.assertEquals(10f, findMax.findMaximumBetween3Values(myFloatList));
    }
    @Test
    //Given 3 float values Second float values is Maximum
    public void given3FloatValue2ndIsMaximum() {
        myFloatList.add(5f);
        myFloatList.add(10f);
        myFloatList.add(9f);
        Assert.assertEquals(10f, findMax.findMaximumBetween3Values(myFloatList));
    }
    @Test
    //Given 3 float values  Third float values is Maximum
    public void given3FloatValue3rdIsMaximum() {
        myFloatList.add(5f);
        myFloatList.add(9f);
        myFloatList.add(10f);
        Assert.assertEquals(10f, findMax.findMaximumBetween3Values(myFloatList));
    }
    @Test
    //Given 3 numbers First numbers is Maximum
    public void given3String1stIsMaximum() {
        myStringList.add("Peach"); //Adding the values to the arraylist
        myStringList.add("Apple");
        myStringList.add("Banana");
        Assert.assertEquals("Peach", findMax.findMaximumBetween3Values(myStringList));
    }
    @Test
    //Given 3 string Second string is Maximum
    public void given3String2ndIsMaximum() {
        myStringList.add("Apple");
        myStringList.add("Peach");
        myStringList.add("Banana");
        Assert.assertEquals("Peach", findMax.findMaximumBetween3Values(myStringList));
    }
    @Test
    //Given 3 String Third String is Maximum
    public void given3String3rdIsMaximum() {
        myStringList.add("Banana");
        myStringList.add("Apple");
        myStringList.add("Peach");
        Assert.assertEquals("Peach", findMax.findMaximumBetween3Values(myStringList));
    }
}
