package immutable;

import java.util.Date;

final class Person {
    private final String name;
    private final Date birthDate; // Mutable object

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = new Date(birthDate.getTime()); // Defensive copy
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime()); // Defensive copy
    }
}

