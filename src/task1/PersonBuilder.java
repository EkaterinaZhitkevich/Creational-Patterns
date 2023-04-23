package task1;

import java.util.OptionalInt;


public class PersonBuilder {
    private String name;
    private String surname;
    private OptionalInt age;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (this.age == null) {
            this.age = OptionalInt.of(age);
        } else {
            throw new IllegalStateException("Возраст уже установлен");
        }

        if (age > 0) {
            this.age = OptionalInt.of(age);
        } else {
            throw new IllegalArgumentException("Некорректное значение для возраста");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("У человека должно быть имя!");
        } else if (surname == null) {
            throw new IllegalStateException("У человека должна быть фамилия!");
        } else if (age == null) {
            this.age = OptionalInt.of(0);
        }
        return new Person(name, surname, age.getAsInt(), address);
    }
}

