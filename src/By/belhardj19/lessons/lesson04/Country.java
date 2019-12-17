package By.belhardj19.lessons.lesson04;

public class Country {
    String title;
    int zipCode = 123456;

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
