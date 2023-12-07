package laba3;

import java.util.List;

public class SameSenderAndRecieverException  extends RuntimeException{
    String[] senderNames;
    String recieverName;

    public SameSenderAndRecieverException(List<Person> from, Person to) {
        this.senderNames = new String[from.size()];
        for (Person p: from) {
            this.senderNames[from.indexOf(p)] = p.getName();
        }
        this.recieverName = to.getName();
    }

    @Override
    public String getMessage() {
        return String.format("%s can be both: reciever and sender", this.recieverName);
    }
}
