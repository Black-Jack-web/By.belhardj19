package By.belhardj19.lessons.lesson8.CheckedException;

public class FinallyExample {
    public String getString() {

        try {
            throw new Exception();
        } catch (Exception e) {
            System.exit(0);
            return "exception";
        } finally {
            return "finally";
        }

    }
}
