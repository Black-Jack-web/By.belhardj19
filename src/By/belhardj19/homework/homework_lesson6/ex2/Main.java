package By.belhardj19.homework.homework_lesson6.ex2;

@SuppressWarnings("Duplicates")
public class Main {

    public static void main(String[] args) {

        List personListHandler = new List();

        personListHandler.addPerson(new Person("Vasily"));
        personListHandler.addPerson(new Person("Ivan"));
        personListHandler.addPerson(new Person("Marina"));
        personListHandler.addPerson(new Person("Olga"));
        personListHandler.addPerson(new Person("Ignat"));
        personListHandler.addPerson(new Person("Marina"));

        personListHandler.getListInfo();
        System.out.println();

        System.out.println(personListHandler.getPersonByName("Marina"));
    }
}