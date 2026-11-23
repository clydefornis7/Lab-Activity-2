
public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        // DEMO 1: Array of Serviceable objects
        System.out.println("=== Serviceable Objects ===");

        Serviceable[] serviceItems = {
            new Car("Toyota", "Corolla", 2020, 4),
            new Motorcycle("Harley-Davidson", "Breakout 117", 2026, "V-Twin"),
            new Truck("Volvo", "VNL 860", 2026, 10),
            new Printer()
        };

        for (Serviceable item : serviceItems) {
            performService(item);
        }

        System.out.println();

        // DEMO 2: Array of Vehicle objects
        System.out.println("=== Vehicle Objects ===");

        Vehicle[] vehicles = {
            new Car("Toyota", "Corolla", 2020, 4),
            new Motorcycle("Harley-Davidson", "Breakout 117", 2026, "V-Twin"),
            new Truck("Volvo", "VNL 860", 2026, 10)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();
            System.out.println();
        }
    }
}


