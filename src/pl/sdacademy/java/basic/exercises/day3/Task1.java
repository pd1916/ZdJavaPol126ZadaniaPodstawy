package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private static final String EMAIL_REGEX = "[A-Za-z0-9._]+@[a-z]+(.[a-z]+)*";
    //private static final String EMAIL_REGEX = "[\\w\\d._]+@\\w+(.\\w+)*";

    public static void main(String[] args) {
        /*
        musi być małpa, jedna małpa
        duże, małe litery, cyfry -> przed małpa
        małe litery -> po małpie
        . _
        paweldudko@outlook
        paweldudko@outlook.com.pl
        paweldudko@outlook.com.pl.
        paweldudko@outlook.com.pl.en.test.cos.tam

        ? zero or one
        * zero or more
        + one or more
         */
        System.out.println(isCorrectEmailFormat("paweldudko@outlook"));
        System.out.println(isCorrectEmailFormat("paweldudko@outlook.com.pl"));
        System.out.println(isCorrectEmailFormat("paweldudko@outlook.com.pl.en.test.cos.tam"));
        System.out.println();
        System.out.println(isCorrectEmailFormat("paweldudko@outlook.com.pl."));
        System.out.println(isCorrectEmailFormat("paweldudko@.pl"));
        System.out.println(isCorrectEmailFormat("paweldudko@"));
        System.out.println(isCorrectEmailFormat("paweldudko@outlook."));
    }

    private static boolean isCorrectEmailFormat(String emailAddress) {
// Option#1
//        Pattern pattern = Pattern.compile("");
//        Matcher matcher = pattern.matcher(emailAddress);
//        return matcher.matches();
// Option#2
//        Pattern.matches("", emailAddress)
// Option#3
        return Pattern.compile(EMAIL_REGEX).matcher(emailAddress).matches();
    }
}
