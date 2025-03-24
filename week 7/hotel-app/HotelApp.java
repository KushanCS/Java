public class HotelApp{

    public static void main(String[] args){
        StandardRoom standardRoom = new StandardRoom();

        LuxurySuite luxurySuite = new LuxurySuite("305", "Alic Green",3,true);

        double stdRoomCostDefault = standardRoom.calculateRoomCost();
        double luxRoomCostDefault = luxurySuite.calculateRoomCost();

        double stdRoomCostDiscounted = standardRoom.calculateRoomCost(5);
        double luxRoomCostDiscounted  = luxurySuite.calculateRoomCost(15);

        System.out.println("--Standard Room Details--");
        standardRoom.displayRoomDetails();
        System.out.println("Total Cost: " + stdRoomCostDefault);
        System.out.println("Total (Discounted) Cost: " + stdRoomCostDiscounted);

        System.out.println();

        System.out.println("--Luxury Suite Details--");
        luxurySuite.displayRoomDetails();
        System.out.println("Total Cost: " +luxRoomCostDefault);
        System.out.println("Total (Discounted) Cost: " + luxRoomCostDiscounted);

    }
}
