package task1;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = 0;
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
        if (age > 0) {
            this.age = age;
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
        if (name == null){
            throw new IllegalArgumentException("У человека должно быть имя!");
        } else if (surname == null){
            throw new IllegalArgumentException("У человека должна быть фамилия!");
        } else {
            return new Person(name, surname, age, address);
        }
    }
}
