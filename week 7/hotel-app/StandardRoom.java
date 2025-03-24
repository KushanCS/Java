public class StandardRoom extends Room{

    public StandardRoom() {
        super();
        this.indicateWifi = false;
    }


    private boolean indicateWifi;

    @Override
    public double calculateRoomCost(int discountPerNight) {
        return 100 * numberOfNightStay;
    }

    @Override
    public void displayRoomDetails(){
        super.displayRoomDetails();
        System.out.println("WiFi Status: " + (indicateWifi ? "Include" : "Not Include"));
        System.out.println("Total Cost: " + calculateRoomCost());
    }
}
