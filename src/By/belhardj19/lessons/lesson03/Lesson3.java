package By.belhardj19.lessons.lesson03;

public class Lesson3 {


    public static void main(String[] args) {

        int a = 15;
        int b = 7;
        if (a > b + b) {
            System.out.println(a + " more than " + (b + b));
            System.out.println("yes");


        }
        String result;
        if (a < 10) {
            result = ("Jacket");
        } else if (a < 18) {
            result = ("Sweater");
            a = 0;
        } else if (a < 25) {
            result = ("Pants");

        } else {
            result = ("nothing");
        }


    }
}


