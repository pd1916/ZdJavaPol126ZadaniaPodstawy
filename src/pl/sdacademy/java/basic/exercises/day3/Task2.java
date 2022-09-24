package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task2 {
    private static final String IBAN_REGEX = "PL[0-9]{26}";

    public static void main(String[] args) {
        String correctIban = "PL12345678901234567890123456";
        System.out.println("If PL IBAN " + correctIban + " has correct format: " +  isCorrectIbanFormat(correctIban));

        String inCorrectIban = "AA12345678901234567890123456";
        System.out.println("If PL IBAN " + inCorrectIban + " has correct format: " +  isCorrectIbanFormat(inCorrectIban));

        inCorrectIban = "AA";
        System.out.println("If PL IBAN " + inCorrectIban + " has correct format: " +  isCorrectIbanFormat(inCorrectIban));

        inCorrectIban = "AA1";
        System.out.println("If PL IBAN " + inCorrectIban + " has correct format: " +  isCorrectIbanFormat(inCorrectIban));

        inCorrectIban = "PL123456789012345678901234567";
        System.out.println("If PL IBAN " + inCorrectIban + " has correct format: " +  isCorrectIbanFormat(inCorrectIban));

        inCorrectIban = "PL";
        System.out.println("If PL IBAN " + inCorrectIban + " has correct format: " +  isCorrectIbanFormat(inCorrectIban));
    }

    private static boolean isCorrectIbanFormat(String iban) {
        return Pattern.compile(IBAN_REGEX).matcher(iban).matches();
    }
}
