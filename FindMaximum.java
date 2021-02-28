public class FindMaximum { // Find maximum Integer value from the given list
    public static int findMaximumBetween3Integer(int[] arrayInt) {
        int max = arrayInt[0];
        for(int index = 1; index < arrayInt.length; index++) {
            if (arrayInt[index] > max)
                max = arrayInt[index];
        }
        return max;
    }
    // Find maximum Float value from the given list
    public static float findMaximumBetween3FloatValues(float[] arrayFloat) {
        float max = arrayFloat[0];
        for(int index = 1; index < arrayFloat.length; index++) {
            if (arrayFloat[index] > max)
                max = arrayFloat[index];
        }
        return max;
    }
}    