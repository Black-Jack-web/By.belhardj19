package By.belhardj19.homework.homework_lesson5.ex1;

public class Table {
    int legs;
    int height;
    String material;
    String type;
    int price;

    public Table (int legs, int height, String material, String type, int price) {
        this.legs = legs;
        this.height = height;
        this.material = material;
        this.type = type;
        this.price = price;
    }




    public Table(int legs, int height, String glass, TypeTable other, int price) {

    }


    @Override
    public String toString() {
        return "Table{" +
                "legs=" + legs + " Beautiful" +
                ", height=" + height + " Beautiful" +
                ", material='" + material + '\'' + " Beautiful" +
                ", type='" + type + '\'' + " Beautiful" +
                ", price=" + price + " Beautiful" +
                '}';
    }
}


//Поля: количество ножек, высота, материал, тип (круглый, прямоугольный, другой формы), цена.