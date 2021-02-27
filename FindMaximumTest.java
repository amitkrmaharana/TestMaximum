import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FindMaximumTest {
    static FindMaximum findMax = new FindMaximum();
    static ArrayList<Integer> myNumList = new ArrayList<>();
    @Test
    //Given 3 numbers First Number is Maximum
    public void given3Numbers1stIsMaximum() {
        myNumList.add(10);//Adding the values to the arraylist
        myNumList.add(5);
        myNumList.add(9);
        Assert.assertEquals(10, findMax.findMaximumBetween3integers(myNumList));
    }
    @Test
    //Given 3 numbers Second Number is Maximum
    public void given3Numbers2ndIsMaximum() {
        myNumList.add(5);
        myNumList.add(10);
        myNumList.add(9);
        Assert.assertEquals(10, findMax.findMaximumBetween3integers(myNumList));
    }
    @Test
    //Given 3 numbers Third Number is Maximum
    public void given3Numbers3rdIsMaximum() {
        myNumList.add(5);
        myNumList.add(9);
        myNumList.add(10);
        Assert.assertEquals(10, findMax.findMaximumBetween3integers(myNumList));
    }
}
