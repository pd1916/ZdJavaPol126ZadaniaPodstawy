package pl.sdacademy.java.basic.exercises.day2;

public class Task4 {
    private static final String REPLACEMENT = "-STOP-";
    private static final String REGEX = "[.,]";

    public static void main(String[] args) {
        String input = "Ala, ma kota. Kot, ma ale.";
        System.out.println(replaceDotsAndCommas(input));
    }

    private static String replaceDotsAndCommas(String input) {
        if(StringValidator.isValid(input)) {
//            return input
//                    .replace(".", REPLACEMENT)
//                    .replace(",", REPLACEMENT);
            return input.replaceAll(REGEX, REPLACEMENT);
        }
        return input;
    }
}
