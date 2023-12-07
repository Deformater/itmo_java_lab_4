package laba3;

public class AddressValueException extends Exception{
    String[] contextArr;
    public AddressValueException(String[] locationArr) {

        this.contextArr = locationArr;
    }

    @Override
    public String getMessage() {
        if (contextArr == null){
            return "Adrees cant null";
        }
        switch (contextArr.length) {
            case 2:
                return String.format("House number must content only numbers not %s", this.contextArr[1]);
            case 3:
                return String.format("House and flat number must content only numbers not %s, %s", this.contextArr[1], this.contextArr[2]);
        }
        return String.format("Invalid size of location array %s", (Object[]) this.contextArr);
    }
}
