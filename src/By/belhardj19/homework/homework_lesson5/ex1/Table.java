package By.belhardj19.homework.homework_lesson5.ex1;

public class Table {
    int legs;
    int height;
    String material;
    TypeTable  type;
    int price;


    public Table(int legs, int height, String glass, TypeTable other, int price) {
        this.legs = legs;
        this.height = height;
        this.price = price;
        this.material = glass;
        this.type = other;
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