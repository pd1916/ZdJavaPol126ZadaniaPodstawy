package pl.sdacademy.java.basic.exercises.day2;

public class Task20 {

    public static void main(String[] args) {
        int[] ints = generateArithmeticProgression(5, 3, 3);
        System.out.println(isArithmeticSequence(ints));
    }

    // 5, 1, 1 => 1, 2, 3, 4, 5
    // 5, 3, 3 => 3, 6, 9, 12, 15
    private static int[] generateArithmeticProgression(int length, int firstElement, int odds) {
        int[] result = new int[length];
        result[0] = firstElement;
        for(int i = 1; i < length; i ++) {
            result[i] = result[i-1] + odds;
        }
        return result;
    }

    private static boolean isArithmeticSequence(int[] input) {
        boolean result = false;
        for(int i = 0; i < input.length - 2; i++) {
            if(input[i] - input[i+1] == input[i+1] - input[i+2]) {
                result = true;
            } else {
                return result;
            }
        }
        return result;
    }
}