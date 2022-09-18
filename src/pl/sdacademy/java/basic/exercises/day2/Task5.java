package pl.sdacademy.java.basic.exercises.day2;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";

        char searchedCharacter = 'a';
        System.out.println("Input: " + input);
        System.out.println("Searched character: " + searchedCharacter);
        System.out.println("Result: " + countCharInString(input, searchedCharacter));

        searchedCharacter = 'z';
        System.out.println("Input: " + input);
        System.out.println("Searched character: " + searchedCharacter);
        System.out.println("Result: " + countCharInString(input, searchedCharacter));
    }

    private static int countCharInString(String input, char searchedCharacter) {
        int counter = 0;
        if(StringValidator.isValid(input) && input.contains(String.valueOf(searchedCharacter))) {
            for(int i = input.indexOf(searchedCharacter); i < input.length(); i++) {
                char character = input.charAt(i);
                if(character == searchedCharacter) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
