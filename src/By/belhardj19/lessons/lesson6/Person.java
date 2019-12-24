package By.belhardj19.lessons.lesson6;

public class Person {
    private  String name;
    private  int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
        this.age = age;

    }

    public void doWork(){
        System.out.println("work something");
    }


    public String getName() {
        return name;
    }

    public int getAge(int age) {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
