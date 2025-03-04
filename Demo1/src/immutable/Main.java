package immutable;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Person p = new Person("Alice", date);

        System.out.println("Before modification: " + p.getBirthDate());

        date.setTime(1000000000L); // Attempt to modify outside

        System.out.println("After modification attempt: " + p.getBirthDate()); // Remains unchanged
    }
}
