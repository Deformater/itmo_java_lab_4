package laba3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            throw new AssertionError("sfdd", new IOException("aboba"));
        } catch (Exception e) {
            System.out.println(e.getCause().getMessage());
        }



        // Dostoevskiy dostoevskiy = new Dostoevskiy();
        // Person readers = new Person("Читатели", List.of(Skills.READING)){
        //     @Override
        //     public String toString() {
        //         return String.format("Читатели [name=%s, skills=%s]", super.getName(), super.getSkills());
        //     }
        // };
        // String text1 = "По нашему мнению, деньги украл кассир и устроил весь этот спектакль, чтоб отвести от себя подозрения. ";
        // Letter letter1 = new Email(text1, List.of(readers), dostoevskiy);
        // System.out.println(letter1.send());


        // Truhti truhti = new Truhti();
        // Lopushok lopushok = new Lopushok();
        // String text2 = "'Грабители' явились в банк, когда в кассе уже было пусто. Само собой разумеется, что ушли они из банка с пустым чемоданом, введя в заблуждение полицейских разинь, с чем их и поздравляем! Читатели Трухти и Лопушок.";
        // Letter letter2 = new Email(text2, List.of(truhti, lopushok), dostoevskiy);
        // System.out.println(letter2.send());

        

        // Kaktus kaktus = new Kaktus();
        // String text3 = "Письма шли также и от читательниц: Спешу уведомить, что похищенные деньги зарыты во дворе дома No 47 по Кривой улице. Желаю успеха в розысках и счастья в личной жизни. Ваша усердная читательница и почитательница госпожа Кактус. При сем сообщаю, что отлично печатаю на пишущей машинке, знаю кулинарию и умею играть на трубе.";
        // Letter letter3 = new Email(text3, kaktus, dostoevskiy, "Кривая улица, 47");
        // System.out.println(letter3.send());

        // Buzoni buzoni = new Buzoni();
        // String text4 = "Думаю, что тупоголовые полицейские погнались не за теми, кто в действительности совершил кражу. Наша доблестная полиция опять съела галошу. Так ей и надо! Вознаграждение за сообщенные мною сведения прошу выслать по адресу: Крысиная горка, дом No 16, кв. 6. Бузони. ";
        // Letter letter4 = new Email(text4, buzoni, dostoevskiy, "Крысиная горка, 16, 6");
        // System.out.println(letter4.send());
    }
}
