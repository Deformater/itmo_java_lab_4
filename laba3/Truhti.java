package laba3;

import java.util.List;

public class Truhti extends Person implements Reader {
    List<Person> readerOfList;

    public Truhti() {
        super("Трухти", List.of(Skills.READING));
        this.readerOfList = List.of(new Dostoevskiy());
    }

    @Override
    public String toString() {
        return String.format("Truhti [name=%s, skills=%s]", super.getName(), super.getSkills());
    }

    @Override
    public List<Person> readerOf() {
        return this.readerOfList;
    }
    
}
