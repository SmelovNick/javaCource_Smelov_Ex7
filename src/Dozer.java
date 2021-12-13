public class Dozer extends Vehicle{
    public int weight;
    private int enginePower;
    protected boolean canDig;

    public Dozer(){
        super();
        this.weight = 20000;
        this.enginePower = 100500;
        this.canDig = true;
    }

    public Dozer(String color, int price, int year, String body, String brand, int weight, int enginePower, boolean canDig) {
        super(color, price, year, body, brand);
        this.weight = weight;
        this.enginePower = enginePower;
        this.canDig = canDig;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void getInfo(){
        System.out.println("Color: " + this.color + " " +
                "Year: " + this.year + " " +
                "enginePower: " + this.enginePower + " " +
                "canDig: " + this.canDig);
    }
}
