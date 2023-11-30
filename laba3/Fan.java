package laba3;

import java.util.List;

interface Fan {
    List<Person> fanOf();

    default void addIdols(List<Person> persons) {
        fanOf().addAll(persons);
    }
}
