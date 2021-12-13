public class Car extends Vehicle{
    private String owner;
    protected int numOfSeats;
    public String wheelsBrand;

    public Car() {
        super();
        owner = "John Doe";
        numOfSeats = 4;
        wheelsBrand = "Michelin";
    }

    public Car(String color, int price, int year, String body, String brand, String owner, int numOfSeats, String wheelsBrand) {
        super(color, price, year, body, brand);
        this.owner = owner;
        this.numOfSeats = numOfSeats;
        this.wheelsBrand = wheelsBrand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void beep(){
        System.out.println("WROOOMMMMM!!!!");
    }
}
