package By.belhardj19.lessons.lesson8.MyException;

public class Main {
    public static void main(String[] args){

        try{
            int result = Factorial.getFactorial(6);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}
