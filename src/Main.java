import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Али", "Аль-Хадад", 79));
        people.add(new Person("Хосе", "Агильерно Альварес", 21));
        people.add(new Person("Люсия", "Родригес", 57));
        people.add(new Person("Хасан", "Абдурахман ибн Хоттаб", 47));
        people.add(new Person("Эрнесто", "Арриола Фернандес Санчес Гарсия", 38));
        System.out.println(people);
        System.out.println();

        Collections.sort(people, new PersonComparator(2));
        System.out.println("Сортировка по возрастанию знатности:");
        System.out.println(people);
    }
}
