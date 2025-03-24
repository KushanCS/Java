public class StandardRoom extends Room{

    private boolean indicateWifi;

    public StandardRoom(){
        super();
        this.indicateWifi = false;
    }

    public StandardRoom(String roomNumber, String guestName, int numberOfNights, boolean indicateWifi) {
        super(roomNumber, guestName, numberOfNights);
        this.indicateWifi = indicateWifi;
    }

    @Override
    public double calculateRoomCost() {
        return 100 * numberOfNights;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Wifi Status: " + (indicateWifi ? "Included" : "Not Included"));;
    }
}

