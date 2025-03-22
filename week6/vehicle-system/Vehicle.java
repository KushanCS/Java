// Base Vehicle class
class Vehicle {
    protected String vehicleName;

    // Default constructor
    public Vehicle() {
        this.vehicleName = "Unknown Vehicle";
    }

    // Parameterized constructor
    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
    }

    // Method overloading for calculating speed
    public double calculateSpeed() {
        return 0.0; // Default speed
    }

    public double calculateSpeed(double factor) {
        return calculateSpeed() * factor;
    }
}