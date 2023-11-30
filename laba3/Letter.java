package laba3;

import java.util.List;

abstract class Letter {
    String text;
    List<Person> from;
    Person to;
    Address address;
    boolean isSent = false;

    protected class Address {
        private String location;
        private String city;
        private String street;
        private Integer houseNum;
        private Integer flatNum;

        public Address(String location) throws AddressValueException {
            String[] locationArr = location.split(", ");
            if (locationArr.length != 2 && locationArr.length != 3) {
                throw new AddressValueException("Address must be in format: \"Street, House number, flat number\" or \"Street, House number\"");
            }

            this.location = location;
            this.city = "Moscow";
            this.street = locationArr[0];
            try {
                this.houseNum = Integer.parseInt(locationArr[1]);
                if (locationArr.length == 3) {
                    this.flatNum = Integer.parseInt(locationArr[2]);
                }
            } catch (NumberFormatException e) {
                throw new AddressValueException("House number and flat number must be integer");
            }
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getLocation() {
            return this.location;
        }

        @Override
        public String toString() {
            if (this.flatNum != null) {
                return String.format("City: %s Street: %s House number: %d Flat number: %d", this.city, this.street, this.houseNum, this.flatNum);
            }
            return String.format("City: %s Street: %s House number: %d", this.city, this.street, this.houseNum);
        }
    }

    public Letter(String text, List<Person> from, Person to) {
        this.text = text;
        this.to = to;
        this.from = from;
    }

    public Letter(String text, List<Person> from, Person to, String location) {
        this(text, from, to);
        this.address = new Address(location);
    }

    public abstract String send();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        String[] nameArr = new String[this.from.size()];
        for (Person person : this.from) {
            nameArr[this.from.indexOf(person)] = person.getName();
        }
        return String.format("From: %s\nTo: %s\nText: %s\nAddress %s", nameArr, this.to.getName(), this.text, this.address);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Letter))
            return false;
        Letter letter = (Letter) obj;
        return letter.getText().equals(this.getText()) && letter.from.equals(this.from) && letter.to.equals(this.to);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}