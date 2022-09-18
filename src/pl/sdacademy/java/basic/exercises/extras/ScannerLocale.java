package pl.sdacademy.java.basic.exercises.extras;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę używając przecinka: ");
        double value1 = scanner.nextDouble();
        System.out.println(value1);

        /* żeby wpisywać kropkę zamiast przecinka powinniśmy użyć zapisu:
         anotherScanner.useLocale(Locale.ENGLISH);
         lub
         Scanner anotherScanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
         */
        Scanner anotherScanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Podaj liczbę używając kropki: ");
        double value2 = anotherScanner.nextDouble();
        System.out.println(value2);
    }
}
