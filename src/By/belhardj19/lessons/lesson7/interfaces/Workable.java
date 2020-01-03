package By.belhardj19.lessons.lesson7.interfaces;

public class Workable {
    String VERSION = "QWE";

    void work() {

    }

    static void staticMethod() {
        System.out.println("Workable.staticMethod()");
    }

    void defaultMethod() {
        System.out.println("workable.defaultMethod()");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("workable.privateMethod()");
    }
}
