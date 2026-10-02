public class Main {

    public static void main(String[] args) {

        // Create three vehicles
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2020);
        Vehicle v2 = new Vehicle("Honda", "Civic", 1995);
        Vehicle v3 = new Vehicle("Ford", "Ranger", 2010);

        // Vehicle 1
        System.out.println("===== VEHICLE 1 =====");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        // Demonstrate getters
        System.out.println("Brand using getter: " + v1.getBrand());
        System.out.println("Model using getter: " + v1.getModel());
        System.out.println("Year using getter: " + v1.getYear());

        // Vehicle 2
        System.out.println("\n===== VEHICLE 2 =====");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());

        System.out.println("Brand using getter: " + v2.getBrand());
        System.out.println("Model using getter: " + v2.getModel());
        System.out.println("Year using getter: " + v2.getYear());

        // Vehicle 3
        System.out.println("\n===== VEHICLE 3 =====");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());

        System.out.println("Brand using getter: " + v3.getBrand());
        System.out.println("Model using getter: " + v3.getModel());
        System.out.println("Year using getter: " + v3.getYear());

        // Test setYear()
        System.out.println("\n===== SET YEAR TESTS =====");

        System.out.println("setYear(2000): " + v1.setYear(2000));
        System.out.println("Stored year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        System.out.println("\nsetYear(1885): " + v1.setYear(1885));
        System.out.println("Stored year: " + v1.getYear());

        System.out.println("\nsetYear(2027): " + v1.setYear(2027));
        System.out.println("Stored year: " + v1.getYear());

        // Test constructor with invalid years
        System.out.println("\n===== CONSTRUCTOR TESTS =====");

        Vehicle invalid1 = new Vehicle("Toyota", "Test1", 1885);
        System.out.println("Constructor year 1885: "
                + invalid1.getYear());

        Vehicle invalid2 = new Vehicle("Honda", "Test2", 2027);
        System.out.println("Constructor year 2027: "
                + invalid2.getYear());
    }
}