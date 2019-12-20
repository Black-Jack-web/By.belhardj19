package By.belhardj19.homework.homework_lesson4.ex3;


public class Main {
    public static void main(String[] args) {
        Essence dwarf = new Essence("Walter", "red and white", "ceramics", 50);

        dwarf.name = "Walter";
        dwarf.color = "red and white";
        dwarf.material = "ceramics";
        dwarf.size = 50;

        dwarf.stand();
        dwarf.watches();

        System.out.println(dwarf.toString());


    }
}
