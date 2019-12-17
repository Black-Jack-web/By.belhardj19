package By.belhardj19.lessons.lesson04;

public class main {
    public static void main(String[] args) {

        Country brazil = new Country();
        brazil.title = "Brazil";
        brazil.zipCode = 123456;

        Person Alfredo = new Person();
        Alfredo.name = "Alfredo";
        Alfredo.age = 22;
        Alfredo.country = brazil;
        Alfredo.sex=Sex.MALE;

        Alfredo.walk();
        Alfredo.growOld();
        Alfredo.eat("fish");
        System.out.println(Alfredo.age);


        Alfredo.toString();
        System.out.println("Alfredo is" + Alfredo);




    }
}
