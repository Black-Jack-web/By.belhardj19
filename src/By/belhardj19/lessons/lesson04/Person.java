package By.belhardj19.lessons.lesson04;

public class Person {
    String name;
    int age;
    Country country;
    Sex sex;

    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat(String dish) {
        System.out.println(name + " is eating " + dish + " om-om-omn ");


    }

    int growOld() {
        return ++age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                ", sex=" + sex +
                '}';
    }
}
