public class Truck extends Vehicle implements Serviceable {

    private int numberOfWheels;

    public Truck(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wheels: " + numberOfWheels);
    }

    @Override
    public void move() {
        System.out.println("Truck is moving.");
    }

    @Override
    public void service() {
        System.out.println("Truck: inspect cargo brakes.");
    }
}
