package pl.sdacademy.java.basic.exercises.day3.task7;

public class Main {

    public static void main(String[] args) {
//        Cat cat = new Cat("Mruczek");
//        Cat cat1 = new Cat("Filemon");
//        Cat cat2 = new Cat("Bonifacy");
//
//        Cat[] cats = {cat, cat1, cat2};


        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Mruczek");
        cats[1] = new Cat("Filemon");
        cats[2] = new Cat("Bonifacy");

        int i = 2;
        for(Cat cat : cats) {
            //cat.print();
            //System.out.println(cat.toString());
            System.out.println(cat);
            cat.makeSound();
            cat.eatMice(i++ * i);
            System.out.println("***");
        }
    }
}
