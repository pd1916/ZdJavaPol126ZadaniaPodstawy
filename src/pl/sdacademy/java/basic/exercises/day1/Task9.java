package pl.sdacademy.java.basic.exercises.day1;

import java.time.LocalDateTime;

public class Task9 {
    public static void main(String[] args) {
        for(int i = 1; i <= 15; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    private static String fizzBuzz(int number) {
        if(number % 15 == 0) {
            return "FizzBuzz";
        } else if(number % 3 == 0) {
            return "Fizz";
        } else if(number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private static String fizzBuzz2(int number) {
        String result = "";
        if(number % 15 == 0) {
            result = "FizzBuzz";
        } else if(number % 3 == 0) {
            result = "Fizz";
        } else if(number % 5 == 0) {
            result= "Buzz";
        } else {
            result= String.valueOf(number);
        }
        return result;
    }
}
