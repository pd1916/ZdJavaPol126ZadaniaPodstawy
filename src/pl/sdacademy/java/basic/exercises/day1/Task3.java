package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int x = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int y = scanner.nextInt();

        methodForPointA(x, y);
        methodForPointB(x, y);
        methodForPointC(x, y);
        methodForPointD(x, y);
    }

    private static void methodForPointA(int x, int y) {
        boolean result = x > y;
        System.out.println("If x is greater than y: " + result);
    }

    private static void methodForPointB(int x, int y) {
        boolean result = x * 3 > y;
        System.out.println("If x * 3 is greater than y: " + result);
    }

    private static void methodForPointC(int x, int y) {
        boolean result = (y++ < ++x) && (--x < y++);
        System.out.println("If y++ is smaller than ++x and --x is smaller than y++: " + result);
    }

    private static void methodForPointD(int x, int y) {
        boolean result = (x * y) % 2 == 0;
        System.out.println("If x * y is even: " + result);
    }
}