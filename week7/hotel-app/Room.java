public class Room {
    protected String roomNumber;
    protected String guestName;
    protected int numberOfNights;

    //Default constructor
    public Room(){
        this.roomNumber = "000";
        this.guestName = "Unknown";
        this.numberOfNights = 0;
    }

    public Room(String roomNumber, String guestName, int numberOfNights){
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    }

    public void display(){
        System.out.println("Room Number: " +  roomNumber);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Nights: " + numberOfNights);
    }

    public double calculateRoomCost(){
        return 150.00 * numberOfNights;
    }

    public double calculateTotalRoomCost(int discountPerNight){
        double baseRate = calculateRoomCost();
        double totalCost = discountPerNight * numberOfNights;
        return  baseRate - totalCost;
    }
}
