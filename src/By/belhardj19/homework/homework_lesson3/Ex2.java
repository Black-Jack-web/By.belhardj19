package By.belhardj19.homework.homework_lesson3;

public class Ex2 {
    public static void main(String[] args) {

        int salary11 = 100;
        int salary12 = 200;
        int salary13 = 300;
        int min, max;
        min = salary11;
        if (salary12 < min)
            min = salary12;
        if (salary13 < min)
            min = salary13;

        max = salary11;
        if (salary12 > max)
            max = salary12;
        if (salary13 > max)
            max = salary13;
        System.out.println(max - min);
    }
}
