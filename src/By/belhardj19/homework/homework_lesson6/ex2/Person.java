package By.belhardj19.homework.homework_lesson6.ex2;

public class Person {

    private static int counter = 0;

    private String name;
    private int number;

    public Person(String name) {

        this.name = name;
        number = counter++;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {

        return "Person{" +
                "name='" + name + number + '\'' +
                '}';
    }
}