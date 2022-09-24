package pl.sdacademy.java.basic.exercises.day3;

import java.time.LocalDate;

public class Dummy {

    public static void main(String[] args) {
        //System.out.println("Test: " + args[0]);
        if(args.length > 0) {
//            DbRepository db = new ...
//            String[] trans = db.getAllTransactions(args[0]);
            System.out.println("Pobierz transakcje z wczoraj tj. " + args[0]);
        } else {
//            DbRepository db = new ...
//            String[] trans = db.getAllTransactions(LocalDate.now);
            System.out.println("Pobierz transakcje z dzisiaj tj. " + LocalDate.now());
        }
    }
}
