package task1;


import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private OptionalInt age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, OptionalInt age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = OptionalInt.of(age);
        } else {
            throw new IllegalArgumentException("Некорректное значение для возраста");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        if (name != null) {
            return name;
        }
        else
            throw new IllegalArgumentException("У человека должно быть имя!");
    }

    public String getSurname() {
        if ( surname != null)
        return surname;
        else throw new IllegalArgumentException("У человека должна быть фамилия!");
    }

    public OptionalInt getAge() {
        if (this.age != null) {
            return age;
        } else {
            return OptionalInt.empty();
        }
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        if (this.age.getAsInt() != 0) {
            this.age = OptionalInt.of(age.getAsInt()+1);
        }
    }

    public boolean hasAge() {
        return age.isPresent();
    }

    public boolean hasAddress() {
        boolean hasAddress = false;
        if (this.address == null) {
            return hasAddress;
        } else {
            return !hasAddress;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder(name, surname);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("task1.Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        if (this.age.isPresent()) {
            sb.append(", age=").append(age.getAsInt());
        } else {
            sb.append(", age=").append(" не установлен");
        }
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
