
public class Car extends Vehicle {

    @Override
    public void moveForward() {
        System.out.println("A car moves forward.");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A car moves backwards.");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("A car moves right.");
    }
}
