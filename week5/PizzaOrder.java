public class PizzaOrder {
    private String orderID;
    private String customerName;
    private String size;
    private int toppingCount;
    private boolean isDelivery;

    //Default Constructor
    public PizzaOrder(){
        this.orderID = "N/A";
        this.customerName = "N/A";
        this.size = "Small";
        this.toppingCount = 0;
        this.isDelivery = false;
    }

    public PizzaOrder(String orderID, String customerName) {
        this.orderID = orderID;
        this.customerName = customerName;
    }

    public PizzaOrder(String orderID, String customerName, String size, int toppingCount, boolean isDelivery) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.size = size;
        this.toppingCount = toppingCount;
        this.isDelivery = isDelivery;
    }

    //getter
    public String getSize(){
        return size;
    }

    //setter
    public void setSize(){
        if((size == "Small") || (size == "Medium") || (size == "Large")){
            this.size = size;
        } else {
            System.out.println("Invalid size. Default to small");
            this.size = "Small";
        }
    }

    //method1 calculate total price using stored values
    public double getBasePrice(){
        if (size.equalsIgnoreCase("Medium")){
            return 10.00; //Medium pizza
        } else if (size.equalsIgnoreCase("Large")){
            return 12.00; //Large pizza
        } else {
            return 8.00;
        }
    }

    public double TotalPrice(){
        double basePrice = getBasePrice();
        double total = basePrice + (toppingCount * 1.50);
        if (isDelivery){
            total += 5.00;
        }
        return total;
    }

    //method2 calculate total price with discount
    public double calculateTotalPrice(double discountPercentage){
        double total = calculateTotalPrice();
        double discountAmount = total * discountPercentage / 180;
        return total - discountAmount;
    }
}
