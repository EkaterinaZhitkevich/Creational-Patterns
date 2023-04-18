package task1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder().setName("Мария").setSurname("Петрова").setAge(28).build();
        person1.happyBirthday();
        System.out.println(person1.getAge());
        System.out.println(person1.hasAddress());
        System.out.println(person1.hasAge());

//        task1.Person person2 = new  task1.PersonBuilder().setName("Павел").build();

        Person mom = new PersonBuilder().setName("Марина")
                .setSurname("Павлова")
                .setAge(26)
                .setAddress("Калуга").build();
        Person son = mom.newChildBuilder()
                .setName("Иван")
                .setSurname("Павлов")
                .build();
        System.out.println(mom);
        System.out.println(son);

    }
}
