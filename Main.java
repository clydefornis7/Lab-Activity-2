public class Main {

   public static void printDetails(Vehicle vehicle) {
      vehicle.displayInfo();
   }
      public static void main(String[] args){

      // DEMO 1 : Parent References 
      System.out.println("=== Parent References ===");
      Vehicle vehicle = new Car("Toyota", "Corolla", 2020, 4);
      vehicle.displayInfo();
      System.out.println();

      // 1.1 The same variable now refers to a Truck object
      System.out.println("=== Truck ===");
      Truck truck = new Truck("Volvo", "VNL 860", 2026, 10);
      printDetails(truck);
      System.out.println();

      // 1.2 The same variable now refers to a Motorcycle object
      System.out.println("=== Motorcycle ===");
      Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Breakout 117", 2026, "V-Twin");
      printDetails(motorcycle);
      System.out.println(); 

      // DEMO 2 : One method accept different Vehicle subclasses
      System.out.println("=== Method Parameters ===");
      Car car = new Car("Chevy", "Bolt", 2024, 4);
      printDetails(car);
      System.out.println(); 

      // DEMO 3 : One array holds different Vehicle subclasses
      System.out.println("=== Array of Vehicles ===");
      Vehicle[] vehicles = {
          new Car("Toyota", "Corolla", 2020, 4),
          new Truck("Volvo", "VNL 860", 2026, 10),
          new Motorcycle("Harley-Davidson", "Breakout 117", 2020, "V-Twin")
      };
      for (Vehicle currentVehicle : vehicles) {
          printDetails(currentVehicle);
          System.out.println(); 
      }
   }
}