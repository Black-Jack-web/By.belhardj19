package By.belhardj19.homework.homework_lesson3;

public class Ex1 {
    public static void main(String[] args) {
        int a = 20;

        String result;
        if (a < 5) {
            result = "Jacket";
        } else if (a < 15) {
            result = "Sweater";
        } else if (a < 25) {
            result = "T-short";
        } else if (a < 30) {
            result = "cap";
        } else {
            result = "nothing";
        }

        System.out.println(result);
        System.out.println(a);
    }
}
