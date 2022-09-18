package pl.sdacademy.java.basic.exercises.day2;

public class Task13 {
    public static void main(String[] args) {
//        int[] inputs2 = new int[4];
//        inputs2[0] = 5;
//        inputs2[1] = 8;
//        inputs2[2] = -7;
//        inputs2[3] = 10;
        int[] inputs = {12, 7, 19};
        System.out.println("Min value: " + getMinValue(inputs));
        System.out.println("Max value: " + getMaxValue(inputs));
        System.out.println("Sum: " + sum(inputs));
    }

    private static int getMinValue(int[] inputs) {
        int minValue = inputs[0];
//        for(int i = 1; i < inputs.length; i++) {
//            if(minValue > inputs[i]) {
//                minValue = inputs[i];
//            }
//        }
        for (int element : inputs) {
            if(minValue > element) {
                minValue = element;
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for(int element : inputs) {
            if(maxValue < element) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        int sum = 0;
        for(int element : inputs) {
            sum += element;
            //sum  = sum + element;
        }
        return sum;
    }
}
