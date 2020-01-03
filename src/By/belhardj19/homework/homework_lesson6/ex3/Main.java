package By.belhardj19.homework.homework_lesson6.ex3;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double startTemp = 3000;
        double delta = 5;
        int count = 10;

        TemperatureHandler temperatureHandler = new TemperatureHandler(startTemp, delta, count);

        List<Double> result = temperatureHandler.compute();

        result.forEach(x -> System.out.printf(Locale.ENGLISH, "%.2f ", x));
    }
}
