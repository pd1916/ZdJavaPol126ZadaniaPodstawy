package pl.sdacademy.java.basic.exercises.day2;

public class Task8 {
    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;

    public static void main(String[] args) {
        /*
        String - jest niemodyfikowalny, za każdym razem (podczas operacji na nim)
                 jest tworzony nowy obiekt w pamięci
        StringBuilder - jest modyfikowalny, pracujemy cały czas na tym samym obiekcie
         */
//        String str = "ala";
//        str += " ma kota";
//        System.out.println(str);
//
//        StringBuilder sb = new StringBuilder("ala");
//        sb.append(" ma psa");
//        String string = sb.toString();
//        System.out.println(sb);

        String input = "Ala, ma kOta!";
        System.out.println("Result: " + replaceChars(input));
    }

    private static String replaceChars(String input) {
        if(StringValidator.isValid(input)) {
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if(currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) { // wielka litera
                    //String s = String.valueOf(currentChar).toLowerCase(); //option1
                    //String s = String.valueOf(currentChar + 32); // option2
                    //result  = result + String.valueOf(currentChar + 32);
                    //result  = result + s;
                    result.append((char) (currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else if(currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) { //mała litera
                    result.append((char) (currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else {
                    result.append(currentChar);
                }
            }
            return result.toString();
        }
        return input;
    }
}
