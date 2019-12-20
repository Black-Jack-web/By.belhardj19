package By.belhardj19.homework.homework_lesson4.ex3;


public class Essence {
    String name;
    String color;
    String material;
    int size;

    public Essence(String name, String color, String material, int size) {
        this.name = name;
        this.color = color;
        this.material = material;
        this.size = size;


    }

    Essence(String name) {
        this.name = name;
        this.size = 50;
        this.material = "ceramics";
        this.color = "red and white";


    }


    void stand() {
        System.out.println(name + " stand here");

    }


    @Override
    public String toString() {
        return "Essence{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", size=" + size +
                '}';
    }

    void watches() {
        System.out.println(name + " watches all day ");
    }
}

