package By.belhardj19.lessons.lesson6;

public class Manager extends Person {
   private String phone;

    public Manager(String phone) {
        this.phone = phone;
    }

    public Manager(String name, String phone) {
        super(name);
        this.phone = phone;
    }
    public void  drinkCoffee(){
        System.out.println(getName() + "is drinking coffee");

    }

    @Override
    public String toString() {
        return "Manager{" +
                "phone='" + phone + '\'' +
                '}' + super.toString();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
