package laba3;

import java.util.ArrayList;
import java.util.List;

public class Dostoevskiy extends Person implements Writer {
    private List<Books> books = new ArrayList<>();

    public Dostoevskiy() {
        super("Достоевский", List.of(Skills.WRITING));
        this.addBooks(List.of(Books.WAR_AND_PEACE, Books.IDIOT, Books.CRIME_AND_PUNISHMENT, Books.THE_BROTHERS_KARAMAZOV));    
    }

    @Override
    public List<Books> writerOf() {
        return this.books;
    }

    @Override
    public String toString() {
        return String.format("Dostoevskiy [name=%s, skills=%s, books=%s]", super.getName(), super.getSkills(), this.writerOf());
    }
    
}
