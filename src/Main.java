import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Set<Integer> setHash = new HashSet<>();
       Set<Integer> setLinked = new LinkedHashSet<>();
       Set<Integer> setTree = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        int nr;
        for (int i = 0; i < 20; i++){
            nr = random.nextInt(50);
            setHash.add(nr);
            setLinked.add(nr);
            setTree.add(nr);
            list.add(nr);
        }
        for (int number : setHash) System.out.println(number + ". ");
        System.out.println(" ");
        for (int number : setLinked) System.out.println(number + ". ");
        System.out.println(" ");
        for (int number : setTree) System.out.println(number + ". ");
        System.out.println(" ");
        for (int number : list) System.out.println(number + ". ");

        List<Integer>listset = new ArrayList<>(setHash);
        System.out.println(listset.get(4));

        System.out.println("------------------------------------------------------------------");

        Set<Person>persons = new HashSet<>();
        Person p1 = new Person("Patryk", "Prokop", 12, "12345678901");
        Person p2 = new Person("Roch", "Rara", 12, "12345678902");
        Person p3 = new Person("Patryk", "Prokop", 12, "12345678903");
        Person p4 = new Person("Patryk", "Prokop", 12, "12345678904");
        Person p5 = new Person("Patryk", "Prokop", 12, "12345678905");

        System.out.println("-----------drukowanie Z iteratorem--------------");
        Iterator<Person> usersIterator = persons.iterator();
        while (usersIterator.hasNext()){
            System.out.println(usersIterator.next());
        }

        System.out.println("-----------usuwanie Z iteratorem--------------");
        Iterator<Person> usersIterator1 = persons.iterator();
        while (usersIterator1.hasNext()){
            Person currentUser = usersIterator1.next();
            if (currentUser.getName().equals("Janek")){
                usersIterator1.remove();
            }
        }
        for (Person person : persons) System.out.println(person);

        ComparatorByPesel comp = new ComparatorByPesel();
        Set<Person> people = new TreeSet<>(comp);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        for (Person person : people) System.out.println(person);


    }
}