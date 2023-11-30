package laba3;

import java.util.List;

public class Buzoni extends Person implements Reader {
    List<Person> readerOfList;

    public Buzoni() {
        super("Бузони", List.of(Skills.READING));
        this.readerOfList = List.of(new Dostoevskiy());
    }

    @Override
    public String toString() {
        return String.format("BUzoni [name=%s, skills=%s]", super.getName(), super.getSkills());
    }

    @Override
    public List<Person> readerOf() {
        return this.readerOfList;
    }
    
}
