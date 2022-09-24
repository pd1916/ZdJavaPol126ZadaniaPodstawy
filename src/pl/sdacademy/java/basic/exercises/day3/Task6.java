package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {
    private static final String INPUT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        //pobieramy date od usera i zapisuejmy jako string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert date in format [" + INPUT_DATE_FORMAT + "]: ");
        String input = scanner.nextLine();

        //konwertujemy input na LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT);
        LocalDateTime nextLesson = LocalDateTime.parse(input, formatter);

        //wyliczamy ile dni to nastepnych zajec
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(now, nextLesson);
        long days = duration.toDays();
        System.out.println("You have " + days + " days to the nest lesson.");

        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int seconds = duration.toSecondsPart();
        System.out.println("You have days:" + days + " Hours:" + hours + " Minutes:" + minutes + " Secs:" + seconds);
        System.out.printf("You have days:%02d Hours:%01d Minutes:%01d Secs:%01d", days, hours, minutes, seconds);
    }
}
