package By.belhardj19.homework.homework_lesson3;

public class Ex4 {
    public static void main(String[] args) {


        int startSum = 1000;
        double proc = 0.1; // 10%
        int years = 2;

        double money = startSum;

        for (int i = 0; i < years; i++)
            money += money * proc;

        System.out.println(
                "Вклад на " + startSum +
                        " тугриков на " + years +
                        " лет под " + proc +
                        "% даст в итоге " + money + " тугриков");

    }
}
