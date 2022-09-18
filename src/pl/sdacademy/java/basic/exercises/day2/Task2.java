package pl.sdacademy.java.basic.exercises.day2;

public class Task2 {

    public static void main(String[] args) {
        String input = "programowanie";

        String prefix = "pro";
        System.out.println("Prefix: " + prefix);
        System.out.println("Result " + ifWordContainsPrefix(input, prefix));

        prefix = "ala";
        System.out.println("Prefix: " + prefix);
        System.out.println("Result " + ifWordContainsPrefix(input, prefix));

        prefix = null;
        System.out.println("Prefix: " + prefix);
        System.out.println("Result " + ifWordContainsPrefix(input, prefix));

        String suffix = "nie";
        System.out.println("Suffix: " + suffix);
        System.out.println("Result " + ifWordContainsSuffix(input, suffix));

        suffix = "ala";
        System.out.println("Suffix: " + suffix);
        System.out.println("Result " + ifWordContainsSuffix(input, suffix));

        suffix = null;
        System.out.println("Suffix: " + suffix);
        System.out.println("Result " + ifWordContainsSuffix(input, suffix));
    }

    private static boolean ifWordContainsPrefix(String input, String prefix) {
        if(StringValidator.isValid(input) && StringValidator.isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;
    }

    private static boolean ifWordContainsSuffix(String input, String suffix) {
        if(StringValidator.isValid(input) && StringValidator.isValid(suffix)) {
            return input.endsWith(suffix);
        }
        return false;
    }
}
