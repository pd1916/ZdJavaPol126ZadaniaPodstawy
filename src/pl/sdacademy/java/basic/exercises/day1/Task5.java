package pl.sdacademy.java.basic.exercises.day1;

public class Task5 {

    public static void main(String[] args) {
        int firstDigit = 11;
        int secondDigit = 4;
        int sum = sumOfTheSequence(firstDigit, secondDigit);
        System.out.println("Sum: " + sum);
    }

    private static int sumOfTheSequence(final int firstDigit, final int secondDigit) {
        int start = firstDigit;
        int stop = secondDigit;
        if(firstDigit > secondDigit) {
            start = secondDigit;
            stop = firstDigit;
        }
        int sum = 0;
        //#1 Option
//        for(int i = firstDigit; i <= secondDigit; i++) {
//            //sum = sum + i;
//            sum += i;
//        }

        //#2 Option
//        int i = firstDigit;
//        while(i <= secondDigit) {
//            sum += i;
//        }

        //#3 Option
        do {
            sum += start;
            start++;
        }while(start <= stop);

        return sum;
    }
}
