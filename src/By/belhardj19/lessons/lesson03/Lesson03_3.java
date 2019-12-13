package By.belhardj19.lessons.lesson03;

public class Lesson03_3 {
    public static void main(String[] args) {
//        Массивы
        int[] intsArray = {0, 11, -2, 21, 5};
        for (int i = 0; i < intsArray.length; i++) {
            if (i % 2 != 0)
                intsArray[i] += intsArray[i];
            /* System.out.println(intsArray[i]);*/
        }
        for (int digit : intsArray) {
            System.out.println(digit + " ");
            System.out.println();
        }


    }
}
