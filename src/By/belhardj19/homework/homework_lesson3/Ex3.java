package By.belhardj19.homework.homework_lesson3;


public class Ex3 {
    public static void main(String[] args) {


        int a;
        int n;

        for (
                int i = 0;
                i < 5; i++) { //цикл

            n = 1;
            a = i;
            while (a > 0) {

                n *= 5; //в какую степень хочу возводить!
                a--;
            }

            System.out.println( "5 в степени " +  i + " равно " + n);
        }
    }
}