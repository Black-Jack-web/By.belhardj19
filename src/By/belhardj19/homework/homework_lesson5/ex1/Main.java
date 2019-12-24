package By.belhardj19.homework.homework_lesson5.ex1;


public class Main {
    public static void main(String[] args) {


        Table table1 = new Table(4, 120, "red wood", TypeTable.ROUND, 500);
        Table table2= new Table(4, 150, "wood", TypeTable.SQUARE, 280);
        Table table3 = new Table(3, 130, "glass", TypeTable.OTHER, 300);


        Table[] array = {table1, table2, table3,};
        for (Table a : array)
            System.out.println(a);



    }
 


}


//Поля: количество ножек, высота, материал, тип (круглый, прямоугольный, другой формы), цена.