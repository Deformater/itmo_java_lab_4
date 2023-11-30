package laba3;

import java.util.List;

public class Lopushok extends Person implements Reader{
    List<Person> readerOfList;

    public Lopushok() {
        super("Лопушок", List.of(Skills.READING));
        this.readerOfList = List.of(new Dostoevskiy());
    }

    @Override
    public String toString() {
        return String.format("Lopushok [name=%s, skills=%s]", super.getName(), super.getSkills());
    }

    @Override
    public List<Person> readerOf() {
        return this.readerOfList;
    }
    
}
