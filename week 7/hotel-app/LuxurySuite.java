public class LuxurySuite extends Room{

    private boolean mealPickup;

    public LuxurySuite() {
        super();
        this.mealPickup = false;
    }

    public LuxurySuite(String roomNumber, String guestNames, int numberOfNightStay, boolean mealPickup) {
    }

    @Override
    public double calculateRoomCost(int discountPerNight) {
        double fee = 200 * numberOfNightStay;
        if (mealPickup){
            fee += 75;
        }
        return fee;
    }

    @Override
    public void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("Breakfast and Airport Pickup: " + (mealPickup ? "Include" : "Not Include"));
        System.out.println("Total Cost: " + calculateRoomCost());
    }
}
