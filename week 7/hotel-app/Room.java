public abstract class Room {
    protected String roomNumber;
    protected String guestNames;
    protected int numberOfNightStay;

    //Default constructer
    public Room() {
        this.roomNumber = "000";
        this.guestNames = "N/A";
        this.numberOfNightStay = 0;
    }

    public Room(String roomNumber, String guestNames, int numberOfNightStay) {
        this.roomNumber = roomNumber;
        this.guestNames = guestNames;
        this.numberOfNightStay = numberOfNightStay;
    }

    public abstract double calculateRoomCost(int discountPerNight);

    public void displayRoomDetails(){
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest Name: " + guestNames);
        System.out.println("Number of Nights:" + numberOfNightStay);
    }

    public double calculateRoomCost(){
        return 150.00;
    }

    public double calculateTotalCost(int discountPerNight){
        double baseRate = calculateRoomCost();
        double totalCost = discountPerNight * numberOfNightStay;
        return baseRate - totalCost;
    }
}
