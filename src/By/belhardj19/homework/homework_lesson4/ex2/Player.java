package By.belhardj19.homework.homework_lesson4.ex2;

public class Player {
    int x, y;
    double distance = 0;

    void printInfo() {
        System.out.println(" [ " + x + " : " + y + " distance " + distance + " ] ");

    }

    void move(int newX, int newY) {

        distance += distance(newX, newY);

        this.x = newX;
        this.y = newY;


    }

    double distance(int newX, int newY) {

        return Math.sqrt(Math.pow(this.x - newX, 2) + Math.pow(this.y - newY, 2));
    }
}
