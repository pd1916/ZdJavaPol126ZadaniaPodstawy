package pl.sdacademy.java.basic.exercises.day3.task8;

public class Main {
    public static void main(String[] args) {
        Poem[] poems = new Poem[3];
        Author author1 = new Author("Tuwim", "PL");
        Author author2 = new Author("Chotomska", "PL");
        Author author3 = new Author("Brzechwa", "PL");

        poems[0] = new Poem(author1, 20);
        poems[1] = new Poem(author2, 55);
        poems[2] = new Poem(author3, 35);

        System.out.println("Max: " + getSurnameWithMaxStropheNumbers(poems));
        System.out.println("Max: " + getAuthorWithMaxStropheNumbers(poems));

    }

    private static String getSurnameWithMaxStropheNumbers(Poem[] poems) {
        int max = 0;
        String surname = null;
        for(Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(max < currentStropheNumbers) {
                max = currentStropheNumbers;
                surname = poem.getCreator().getSurname();
            }
        }
        return surname;
    }

    private static Author getAuthorWithMaxStropheNumbers(Poem[] poems) {
        int max = 0;
        Author author = null;
        for(Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(max < currentStropheNumbers) {
                max = currentStropheNumbers;
                author = poem.getCreator();
            }
        }
        return author;
    }
}
