public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + " лет";
    }
}
