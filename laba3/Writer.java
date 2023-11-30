package laba3;

import java.util.List;

enum Books {
    WAR_AND_PEACE,
    IDIOT,
    CRIME_AND_PUNISHMENT,
    THE_BROTHERS_KARAMAZOV;
}

public interface Writer {

    List<Books> writerOf();

    default void addBooks(List<Books> books) {
        writerOf().addAll(books);
    };

}
