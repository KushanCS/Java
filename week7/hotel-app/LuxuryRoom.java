public class LuxuryRoom extends Room{

    private boolean mealPickup;

    public LuxuryRoom(){
        super();
        this.mealPickup = false;
    }

    public LuxuryRoom(String roomNumber, String guestName, int numberOfNights, boolean mealPickup){
        super(roomNumber, guestName, numberOfNights);
        this.mealPickup = mealPickup;
    }

    public void display() {
        super.display();
        System.out.println("Breakfast and Airport Pickup: " + (mealPickup ? "Included" : "Not Included"));
    }

    @Override
    public double calculateRoomCost() {
        double fee = 200 * numberOfNights;
        if(mealPickup){
            fee += 75;
        }
        return fee;
    }
}
