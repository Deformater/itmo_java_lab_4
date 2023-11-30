package laba3;

import java.util.List;

public class Kaktus extends Person implements Reader, Fan {

    public Kaktus() {
        super("Kaktus", List.of(Skills.TRUMPET, Skills.COOKING));
    }

    @Override
    public List<Person> readerOf() {
        return List.of(new Dostoevskiy());
    }

    @Override
    public List<Person> fanOf() {
        return List.of(new Dostoevskiy());
    }

    @Override
    public String toString() {
        return "Kaktus []";
    }

}