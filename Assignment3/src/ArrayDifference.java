import java.util.ArrayList;

public class ArrayDifference {
    public static void main(String[] args) {
        // ======== 1. DECLARATION AND INITIALIZATION ========
        
        // Array: Fixed-size and must specify or initialize with length
        int[] numbersArray = new int[3]; // Array of size 3
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;

        // ArrayList: Dynamic size, can grow/shrink
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);

        // ======== 2. ACCESSING ELEMENTS ========
        System.out.println("Array element at index 1: " + numbersArray[1]);
        System.out.println("ArrayList element at index 1: " + numbersList.get(1));

        // ======== 3. MODIFYING ELEMENTS ========
        numbersArray[1] = 200;
        numbersList.set(1, 200);
        System.out.println("Modified array element at index 1: " + numbersArray[1]);
        System.out.println("Modified ArrayList element at index 1: " + numbersList.get(1));

        // ======== 4. SIZE HANDLING ========
        // Array length is fixed
        System.out.println("Array length: " + numbersArray.length);

        // ArrayList size is dynamic
        System.out.println("ArrayList size: " + numbersList.size());

        // Add element to ArrayList (dynamic)
        numbersList.add(400);
        System.out.println("ArrayList after adding an element: " + numbersList);

        // Arrays can't dynamically grow without creating a new array

        // ======== 5. LOOPING ========
        System.out.println("\nLooping through Array:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }

        System.out.println("\nLooping through ArrayList:");
        for (int num : numbersList) {
            System.out.print(num + " ");
        }

        // ======== 6. TYPE RESTRICTION ========
        // Arrays can hold primitives like int, double, etc.
        double[] doubleArray = {1.1, 2.2, 3.3};

        // ArrayLists can only hold objects (not primitives), so use wrapper types
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        System.out.println("\n\nArray of doubles:");
        for (double d : doubleArray) {
            System.out.print(d + " ");
        }

        System.out.println("\nArrayList of Doubles:");
        for (Double d : doubleList) {
            System.out.print(d + " ");
        }
    }
}