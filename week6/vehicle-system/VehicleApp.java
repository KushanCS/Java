// Main class to test the implementation
public class VehicleApp {
    public static void main(String[] args) {
        // Create a Car object using the default constructor
        Car car = new Car();

        // Create a Bicycle object using the parameterized constructor
        Bicycle bicycle = new Bicycle("Mountain Bike", 21, 25.0);

        // Display details and calculate speeds
        System.out.println("--- Car Details ---");
        car.displayVehicleDetails();
        System.out.println("Car Speed: " + car.calculateSpeed() + " km/h");
        System.out.println("Car Scaled Speed (1.2x): " + car.calculateSpeed(1.2) + " km/h");

        System.out.println("\n--- Bicycle Details ---");
        bicycle.displayVehicleDetails();
        System.out.println("Bicycle Speed: " + bicycle.calculateSpeed() + " km/h");
        System.out.println("Bicycle Scaled Speed (1.5x): " + bicycle.calculateSpeed(1.5) + " km/h");
    }
}
