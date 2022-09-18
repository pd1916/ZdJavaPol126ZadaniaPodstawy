package pl.sdacademy.java.basic.exercises.day2;

import java.util.Objects;

public class Task15 {

    public static void main(String[] args) {
        String[] firstDigit = {"Ala", "ma", "kota"};
        String[] secondDigit = {"Ala", "ma", "kota"};

        /*
        String[] firstDigit = {"Ala", null, "kota"};
        String[] secondDigit = {"Ala", "ma", "kota"};

        String[] firstDigit = {"Ala", "ma" "kota"};
        String[] secondDigit = {"Ala", null, "kota"};

        String[] firstDigit = {"Ala", null, "kota"};
        String[] secondDigit = {"Ala", null, "kota"};
         */
        System.out.println(areEqual(firstDigit, secondDigit));
    }

    private static boolean areEqual(String[] firstArray, String[] secondArray) {
        /*
        1. czy rozmiar obu tablic jest taki sam
         */
        if(firstArray.length == secondArray.length) {
            for(int i = 0; i < firstArray.length; i++) {
                String elementFromFirstArray = firstArray[i];
                String elementFromSecondArray = secondArray[i];
                if(elementFromFirstArray == null && elementFromSecondArray == null) {
                    continue;
                }
                // "java".equals(null) -> brak NPE
                // null.equals("java") -> NPE
                if(elementFromFirstArray == null || (!elementFromFirstArray.equals(elementFromSecondArray))) {
                //if(!Objects.equals(elementFromFirstArray, elementFromSecondArray)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
