package at.ac.fhcampuswien;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x]; // statisch

        // before Generics!
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("Hola");
        list.add(10);

        for (Object element : list) {
            if(element instanceof String){
                System.out.println(element);
            }
            else if(element instanceof Integer){
                System.out.println("not a String");
            }
        }

        // ab Java 5.0 -> Generics
        // Typsicherheit z.B. auf Collection Ebene
        ArrayList<String> names = new ArrayList<>();
        List<String> students = new ArrayList<>();
        names.add("Mia");
        names.add("Max");

        // HashMap
        Map<Integer,Person> db = new HashMap<>();
        db.put(1, new Person(1, "Max","Mustermann"));
        db.put(2, new Person(2, "Maria","Musterfrau"));
        db.put(3, new Person(3, "Mai","Musterperson"));
        //System.out.println(db.get(2));
        for (Person p : db.values()) {
            System.out.println(p);
        }

        // Sortieren
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Max","Mustermann"));
        persons.add(new Person(2, "Bernard","Mustermann"));
        persons.add(new Person(3, "Andrea","Musterfrau"));
        for (Person p : persons) {
            System.out.println(p);
        }
        //Collections.sort(persons);
    }
}