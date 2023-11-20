package at.ac.fhcampuswien;

public class Person implements Comparable<Person>{
    private int id;
    private String firstname;
    private String lastname;

    public Person(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString(){
        return firstname + " " + lastname;
    }

    @Override
    public int compareTo(Person p) {
        return firstname.compareTo(p.firstname);
    }
}
