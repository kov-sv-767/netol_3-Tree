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

        // people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        Collections.sort(people, (o1, o2) -> {
            int length1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int length2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            int rezLength = length1 - length2;
            int countWords = 2;
            if (length1 > countWords && length2 > countWords) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                if (rezLength > 0) {
                    return 1;
                } else if (rezLength < 0) {
                    return -1;
                } else {
                    int rezAge = o1.getAge() - o2.getAge();
                    if (rezAge > 0) {
                        return 1;
                    } else if (rezAge < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        System.out.println("Сортировка по возрастанию знатности:");
        System.out.println(people);
    }
}
