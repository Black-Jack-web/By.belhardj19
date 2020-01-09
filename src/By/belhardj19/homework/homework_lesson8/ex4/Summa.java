package By.belhardj19.homework.homework_lesson8.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        String s = " ";

        System.out.print("Введите строку:");
        s = sc.nextLine();

        ArrayList<String> line = new  ArrayList<String>(Arrays.asList(s.split(" ")));

        for (int i = 0; i < line.size(); i++)
        {
            System.out.print(line.get(i));
        }

    }
}
