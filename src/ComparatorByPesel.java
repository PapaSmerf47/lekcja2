import java.util.Comparator;

public class ComparatorByPesel implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPesel().compareTo(p2.getPesel());
    }
}
