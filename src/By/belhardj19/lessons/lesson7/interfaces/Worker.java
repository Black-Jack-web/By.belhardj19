package By.belhardj19.lessons.lesson7.interfaces;

public class Worker extends Workable implements Restable {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working hard");
    }

    @Override
    public void rest() {
        System.out.println(name + " is resting");
    }



}
