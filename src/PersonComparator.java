import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int countWords;

    public PersonComparator(int countWords) {
        this.countWords = countWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int length1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int length2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
        int rezLength = length1 - length2;
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
    }
}
