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
 // Find maximum String value from the given list
    public static String findMaximumBetween3Strings(String[] arrayString) {
        String max = arrayString[0];
        for(int index = 1; index < arrayString.length; index++) {
            if (arrayString[index].compareTo(max) > 0)
                max = arrayString[index];
        }
        return max;
    }
    //To print the Integer values
    public static void toPrint(int[] integerArray) {
        for(int index = 0; index < integerArray.length; index++) {
            System.out.print(integerArray[index] + "  ");
        }
    }
    //To print the Float values
    public static void toPrint(float[] integerArray) {
        for(int index = 0; index < integerArray.length; index++) {
            System.out.print(integerArray[index] + "  ");
        }
    }
    //To print the String values
    public static void toPrint(String[] integerArray) {
        for(int index = 0; index < integerArray.length; index++) {
            System.out.print(integerArray[index] + "  ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Test maximum Program");
        int[] arrayInt = {10,5,9};
        float[] arrayFloat = {10,5,9};
        String[] arrayString = {"Banana","Apple","Peach"};
        toPrint(arrayInt);
        System.out.println("The maximum valaue of the  array is " + findMaximumBetween3Integer(arrayInt));
        toPrint(arrayFloat);
        System.out.println("The maximum valaue of the  array is " + findMaximumBetween3FloatValues(arrayFloat));
        toPrint(arrayString);
        System.out.println("The maximum valaue of the  array is " + findMaximumBetween3Strings(arrayString));
    }
}    