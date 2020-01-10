package By.belhardj19.homework.homework_lesson8.ex4;


import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, y, result;
        System.out.println(" Enter first num: ");
        x = num.nextInt();
        System.out.println(" Enter second num ");
        y = num.nextInt();
        result = x + y;

        System.out.println(result);


    }

}