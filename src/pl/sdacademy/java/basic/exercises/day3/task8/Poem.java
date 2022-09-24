package pl.sdacademy.java.basic.exercises.day3.task8;

import java.util.Objects;

public class Poem {
    private Author creator;
    private int stropheNumbers;

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumbers=" + stropheNumbers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Poem poem = (Poem) o;
        return stropheNumbers == poem.stropheNumbers && Objects.equals(creator, poem.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator, stropheNumbers);
    }
}
