package task1;


public class Person {
    private final String name;
    private final String surname;
    private int age = 0;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Некорректное значение для возраста");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        if (name != null)
        return name;
        else
            throw new IllegalArgumentException("У человека должно быть имя!");
    }

    public String getSurname() {
        if ( surname != null)
        return surname;
        else throw new IllegalArgumentException("У человека должна быть фамилия!");
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        if (this.age != 0) {
            this.age++;
        }
    }

    public boolean hasAge() {
        boolean hasAge = false;
        if (this.age != 0) {
            return !hasAge;
        } else {
            return hasAge;
        }
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
        sb.append(", age=").append(age);
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
