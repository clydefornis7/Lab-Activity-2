
public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle(),
            new Truck()
        };

        for (Vehicle vehicle : vehicles) {

            vehicle.moveForward();
            vehicle.moveBackwards();
            vehicle.moveLeft();
            vehicle.moveRight();

            System.out.println("----------------------");
        }
    }
}
