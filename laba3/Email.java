package laba3;

import java.util.List;

public class Email extends Letter {

    public Email(String text, List<Person> from, Person to) {
        super(text, from, to);
        this.from = from;
    }

    public Email(String text, Person from, Person to, String location) {
        super(text, List.of(from), to, location);
        this.from = List.of(from);
    }

    public String send() {
        if (this.address == null) {
            return String.format("From: %s\nTo: %s\nText: %s", this.from.get(0).getEmail(), this.to.getEmail(),
                    this.text);
        }
        return String.format("From: %s\nTo: %s\nText: %s\nAddress %s", this.from.get(0).getEmail(), this.to.getEmail(),
                this.text, this.address);
    }
}
