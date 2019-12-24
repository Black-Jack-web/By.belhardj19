package By.belhardj19.lessons.lesson6;

public class Main {
    public static void main(String[] args) {


        Worker worker = new Worker("Vasya", 18, "pick-axe");
        worker.doWork();
        worker.getAge(18);
        worker.setName("Vasyan");
        System.out.println(worker.toString());


    }
}
