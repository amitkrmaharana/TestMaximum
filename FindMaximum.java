
public class FindMaximum <T extends Comparable> { // Find maximum Integer value from the given list

    public T[] inputArray;

    public FindMaximum(T[] inputArray) {
        this.inputArray = inputArray;
    }
    // Finding maximum value using generics
    public T findMaximumBetween3Values() {
        T max = inputArray[0];
        for(int index = 1; index < inputArray.length; index++) {
            if (inputArray[index].compareTo(max) > 0)
                max = inputArray[index];
        }
        toPrint(max);
        return max;
    }

    //To print the  values using generics
    public <T>void toPrint(T max) {
        System.out.println("The Maximum value is " + max);
    }

    public static void main(String[] args) {
        FindMaximum obj;
        System.out.println("Welcome to Test maximum Program");
        Integer[] arrayInt = {10,5,9,8,23,1};
        Float[] arrayFloat = {35f,62f,23f,2f};
        String[] arrayString = {"Banana","Apple","Peach","Wrangler"};
        new FindMaximum<>(arrayInt).findMaximumBetween3Values();
        new FindMaximum<>(arrayFloat).findMaximumBetween3Values();
        new FindMaximum<>(arrayString).findMaximumBetween3Values();
    }
}