package By.belhardj19.homework.homework_lesson6.ex2;

import java.util.ArrayList;

public class List {

    private final java.util.List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {

        personList.add(person);
    }

    public Person getPersonByName(String name) {

        for (Person person : personList)
            if (person.getName().equals(name))
                return person;

        return null;
    }

    public void getListInfo() {

        personList.forEach(System.out::println);
    }
}