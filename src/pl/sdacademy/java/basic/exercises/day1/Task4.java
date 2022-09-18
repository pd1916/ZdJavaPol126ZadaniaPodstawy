package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    private static final float BMI_MIN_RANGE = 18.5F;
    private static final float BMI_MAX_RANGE = 24.9F;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float weight = getWeightFromUser();
        int height = getHeightFromUser();
        float bmiResult = calculateBmi(weight, height);
        displayBmiResult(bmiResult);
    }

    private static float getWeightFromUser() {
        System.out.print("Please insert weight in kg: ");
        return scanner.nextFloat();
    }

    private static int getHeightFromUser() {
        System.out.print("Please insert height in cm: ");
        return scanner.nextInt();
    }

    private static float calculateBmi(float weight, int height) {
        float heightInMeter = height / 100F;
        return weight / (heightInMeter * heightInMeter);
    }

    private static void displayBmiResult(float bmi) {
        if(bmi < BMI_MIN_RANGE || bmi > BMI_MAX_RANGE) {
            System.out.println("BMI is not correct: " + bmi);
        } else {
            System.out.println("BMI is correct: " + bmi);
        }
    }
}
