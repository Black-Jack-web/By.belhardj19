package By.belhardj19.lessons.lesson7.interfaces;

public class Machine extends Workable {

    private String title;

    public Machine(String title) {
        this.title = title;
    }

    public void work() {
        System.out.println("bzhh-bzhh-bzhh");
    }
}
