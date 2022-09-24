package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task3 {
    private static final String NUMBER_FORMAT_REGEX = "-?[0-9]+(,[0-9]+)?";

    public static void main(String[] args) {
        /*
        correct:
        1234,1234
        -1234,1234
        -10
        10

        incorrect:
        123a123
        123,

        012,123

         */
        System.out.println(isCorrectFormat("123,123"));
        System.out.println(isCorrectFormat("-123,123"));
        System.out.println(isCorrectFormat("-123"));
        System.out.println(isCorrectFormat("123"));
        System.out.println();
        System.out.println(isCorrectFormat("123a123"));
        System.out.println(isCorrectFormat("123,"));
        System.out.println(isCorrectFormat(",123"));
        System.out.println(isCorrectFormat("123,123,123"));
    }

    private static boolean isCorrectFormat(String input) {
        return Pattern.compile(NUMBER_FORMAT_REGEX).matcher(input).matches();
    }
}
