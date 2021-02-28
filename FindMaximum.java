public class FindMaximum { // Find maximum Integer value from the given list
    public static int findMaximumBetween3Integer(int[] arrayInt) {
        int max = arrayInt[0];
        for(int index = 1; index < arrayInt.length; index++) {
            if (arrayInt[index] > max)
                max = arrayInt[index];
        }
        return max;
    }
}    