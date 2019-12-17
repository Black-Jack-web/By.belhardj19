package By.belhardj19.homework.homework_lesson3;

public class Ex6 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 7, 56, 95, 35, 41, 10};
        int sum = 0;
        for (int f = 0; f < array.length; f++) {
            sum = sum + array[f];
        }
        System.out.println(sum);
        System.out.println(sum/ 2); //хз как по другому
    }
}

