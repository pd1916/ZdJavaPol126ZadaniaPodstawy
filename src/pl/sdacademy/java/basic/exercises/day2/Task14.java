package pl.sdacademy.java.basic.exercises.day2;

public class Task14 {
    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        int lengthOfNewArray = countNegativeDigitsInArray(inputs);
        if(lengthOfNewArray > 0) {
            int[] result = createNewArrayWIthNegativeValues(inputs, lengthOfNewArray);
            for(int element : result) {
                System.out.println(element);
            }
        }
    }

    private static int countNegativeDigitsInArray(int[] inputs) {
        int counter = 0;
        for(int element : inputs) {
            if(element < 0) {
                counter++;
            }
        }
        return counter;
    }

    // int[] inputs = {12, -7, 19, -5};
    private static int[] createNewArrayWIthNegativeValues(int[] inputs, int lengthOfNewArray) {
        int[] result = new int[lengthOfNewArray];
        for(int i = 0, j = 0; i < inputs.length; i++) {
            if(inputs[i] < 0) {
                // dodaj wartość do nowej tablicy
                result[j] = inputs[i];
                j++;
            }
        }
        return result;
    }
}
