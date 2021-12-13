public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Blue", 13000, 2006, "sedan", "Ford");
        vehicle1.beep();
        vehicle1.getInfo();
        System.out.println(vehicle1.getBody() + " " + vehicle1.getBrand() + " " + vehicle1.getPrice());


        Vehicle vehicle2 = new Vehicle();
        vehicle2.getInfo();
        System.out.println(vehicle2.getBody() + " " + vehicle2.getBrand() + " " + vehicle2.getPrice());

        Car car1 = new Car("Blue", 13000, 2006, "sedan", "Ford",
                "Frank", 2, "Yokohama");
        car1.beep();
        car1.getInfo();

        Car car2 = new Car();
        car2.beep();
        car2.getInfo();

        Dozer dozer1 = new Dozer("Yellow", 130000, 2000, "dozer",
                "BELAZ", 13000, 400000, false);
        dozer1.getInfo();

        Dozer dozer2 = new Dozer();
        dozer2.getInfo();
    }
}
