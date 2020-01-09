package By.belhardj19.lessons.lesson8.UnCheckedException;

public class GetNullExample {
    private String object;

    public GetNullExample(String object) {
        this.object = object;
    }

    public String getLowercase() {

        String result;

        try {
            result = object.toLowerCase();
        } catch (NullPointerException e) {
            result = "";
        }

        return result;
    }
}
