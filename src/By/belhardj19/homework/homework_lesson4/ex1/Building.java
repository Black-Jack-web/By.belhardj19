package By.belhardj19.homework.homework_lesson4.ex1;

public class Building {
    int adress;
    int flours;
    boolean elevator;
    String material;
    String name;


    public Building(int adress, int flours, boolean elevator, String material, String name) {
        this.adress = adress;
        this.flours = 15;
        this.elevator = true;
        this.material = "bricks";
        this.name = name;
    }

    public Building() {

    }

    @Override
    public String toString() {
        return "Building{" +
                "adress=" + adress +
                ", flours=" + flours +
                ", elevator=" + elevator +
                ", material='" + material + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    Building(String name){
        this.adress = 24;
        this.elevator = true;
        this.material = "bricks";
        this.flours = 15;
        this.name = "Onliner";


    }

}
