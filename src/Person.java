public class Person {
    public Person(String name, String surname, int age, String pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    private String name;
    private String surname;
    private int age;
    private String pesel;
}
