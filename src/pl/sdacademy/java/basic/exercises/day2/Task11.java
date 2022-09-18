package pl.sdacademy.java.basic.exercises.day2;

public class Task11 {
    public static void main(String[] args) {
        String input = "kajak";
        System.out.println("Input: " + input);
        System.out.println("Result: " + isPalindrome(input));

        input = "java";
        System.out.println("Input: " + input);
        System.out.println("Result: " + isPalindrome(input));

        input = null;
        System.out.println("Input: " + input);
        System.out.println("Result: " + isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        if(StringValidator.isValid(input)) {
            String reversedInput = new StringBuilder(input).reverse().toString();
            return input.equalsIgnoreCase(reversedInput);
        }
        return false;
    }


    private static boolean isPalindromeWithoutStringBuilder(String input) {
        if(StringValidator.isValid(input)) {
            int forward = 0;
            int backward = input.length() - 1;
            while(backward > forward) {
                char forwardChar = input.charAt(forward);
                char backwardChar = input.charAt(backward);
                if(forwardChar != backwardChar) {
                    return false;
                }
                forward++;
                backward--;
            }
            return true;
        }
        return false;
    }
}
