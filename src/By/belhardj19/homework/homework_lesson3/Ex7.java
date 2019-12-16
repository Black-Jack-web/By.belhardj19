package By.belhardj19.homework.homework_lesson3;

public class Ex7 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {  //11 для того чтобы таблица была на 10х10
            for (int g = 1; g < 11; g++) {
                System.out.print(g * i + " ");
            }
            System.out.println(" ");
        }
    }
}

