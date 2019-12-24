package By.belhardj19.lessons.lesson6;

public class Worker extends Person{
    private String instrument;



    public Worker(String name, String instrument) {
        super(name);
        this.instrument = instrument;
    }

    public Worker(String vasya, int i, String s) {

    }

    public void smoke() {
        System.out.println(super.getName() + "is smoking");
    }

    @Override
    public void doWork() {
        System.out.println(getName() + "work hard");
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "instrument='" + instrument + '\'' +
                '}' + super.toString();
    }




}
