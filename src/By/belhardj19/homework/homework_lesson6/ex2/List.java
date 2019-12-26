package By.belhardj19.homework.homework_lesson6.ex2;

import java.util.*;

public class List {

    public static void main(String[] args) {
        java.util.List<Person> persons = new ArrayList<Person>();
        Person person1 = new Person("Charly");
        Person person2 = new Person("John");
        Person person3 = new Person("Misha");
        Person person4 = new Person("Jessi");
        Person person5 = new Person("Walter");
        Collections.addAll(persons, person1, person2, person3, person4, person5);

        System.out.println(persons);


    }


}