package By.belhardj19.lessons.lesson8.UnCheckedException;

public class Main {
    public static void main(String[] args) {

        System.out.println(new GetNullExample(null).getLowercase());
        System.out.println(new GetNullExample("NUEQaa").getLowercase());

    }
}
