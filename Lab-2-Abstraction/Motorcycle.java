
public class Motorcycle extends Vehicle {

    @Override
    public void moveForward() {
        System.out.println("A motorcycle moves forward.");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A motorcycle moves backwards.");
    }

    @Override
    public void moveLeft() {
        System.out.println("A motorcycle moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("A motorcycle moves right.");
    }
}
