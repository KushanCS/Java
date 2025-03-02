package productApp;

public class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    //constructor
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    //setters
    public void setProductId() {
        this.productId = productId;
    }

    public void setProductName() {
        this.productName = productName;
    }

    public void setPrice() {
        this.price = price;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    //getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayDetails(){
        System.out.println("");
        System.out.println("Product ID: "+this.productId);
        System.out.println("Product Name: "+this.productName);
        System.out.println("Product Price: "+this.price);
        System.out.println("Product Quantity: "+this.quantity);
    }

    public double calculateTotalValue() {
        return price * quantity;
    }
}
