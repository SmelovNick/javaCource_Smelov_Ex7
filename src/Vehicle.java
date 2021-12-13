public class Vehicle {
    public String color;
    private int price;
    protected int year;
    private String body;
    private String brand;

    public Vehicle(){
        this("Green", 10000, 1999, "crossover", "Toyota");
    }

    public Vehicle(String color, int price, int year, String body, String brand){
        this.color = color;
        this.price = price;
        this.year = year;
        this.body = body;
        this.brand = brand;
    }

    public void beep(){
        System.out.println("Default Honk =)");
    }

    public void getInfo(){
        System.out.println("Color: " + color + " " +
                "Price: " + price + " " +
                "Year: " + year + " " +
                "Body: " + body + " " +
                "Brand: " + brand);
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
