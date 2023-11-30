package laba3;

import java.util.List;

interface Reader {    
    List<Person> readerOf();

    default void addWriter(Person person) {
        readerOf().add(person);
    }
}