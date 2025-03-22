// Car class inheriting from Vehicle
class Car extends Vehicle {
    private int engineCapacity;
    private double topSpeed;

    // Default constructor
    public Car() {
        super("Default Car");
        this.engineCapacity = 1000;
        this.topSpeed = 150.0;
    }

    // Parameterized constructor
    public Car(String vehicleName, int engineCapacity, double topSpeed) {
        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}
