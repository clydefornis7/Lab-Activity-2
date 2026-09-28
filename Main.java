public class Main {
   public static void main(String[] args){
     
     Vehicle v1 = new Vehicle("Toyota", "Corolla", 2020);
     Vehicle v2 = new Vehicle("Honda", "Civic", 1995);
     Vehicle v3 = new Vehicle("Ford", "Ranger", 2010);
    
     v1.displayInfo();
     v2.displayInfo();
     v3.displayInfo();
          
     System.out.println("\nVehicle 1");
     System.out.println("Age: " + v1.calculateAge());
     System.out.println("Vintage: " + v1.isVintage());
     
     System.out.println("\nVehicle 2");
     System.out.println("Age: " + v2.calculateAge());
     System.out.println("Vintage: " + v2.isVintage());
     
     System.out.println("\nVehicle 3");
     System.out.println("Age: " + v3.calculateAge());
     System.out.println("Vintage: " + v3.isVintage());
  }
}