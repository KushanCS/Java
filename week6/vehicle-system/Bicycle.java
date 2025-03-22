// Bicycle class inheriting from Vehicle
class Bicycle extends Vehicle {
    private int gearCount;
    private double maxPedalSpeed;

    // Parameterized constructor
    public Bicycle(String vehicleName, int gearCount, double maxPedalSpeed) {
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Max Pedaling Speed: " + maxPedalSpeed + " km/h");
    }
}