import org.w3c.dom.ls.LSOutput;

public class HotelApp {

    public static void main(String[] args){

        StandardRoom standardRoom = new StandardRoom();

        LuxuryRoom luxuryRoom = new LuxuryRoom("305", "Alic Green",3,true);

        double stdRoomCostDefault = standardRoom.calculateRoomCost();
        double luxRoomCostDefault = luxuryRoom.calculateRoomCost();

        double stdRoomCostDiscounted = standardRoom.calculateTotalRoomCost(5);
        double luxRoomCostDiscounted = luxuryRoom.calculateTotalRoomCost(15);

        System.out.println("--Standard Room Details--");
        standardRoom.display();
        System.out.println("Total Cost: " + stdRoomCostDefault);
        System.out.println("Total (Discounted) Cost: " + stdRoomCostDiscounted);

        System.out.println();

        System.out.println("--Luxury Suite Details--");
        luxuryRoom.display();
        System.out.println("Total Cost: " + luxRoomCostDefault);
        System.out.println("Discounted Cost(per night $15 off): " + luxRoomCostDiscounted);
    }
}
