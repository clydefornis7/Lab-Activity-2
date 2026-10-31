
public class Truck extends Vehicle {

    @Override
    public void moveForward() {
        System.out.println("A truck moves forward.");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A truck moves backwards.");
    }

    @Override
    public void moveLeft() {
        System.out.println("A truck moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("A truck moves right.");
    }
}
