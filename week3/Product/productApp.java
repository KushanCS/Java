package productApp;

import java.util.Scanner;

public class productApp {
    public static void main(String[] args) {

        //getting user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product Id: ");
        int productId = scanner.nextInt();

        System.out.print("Enter product name: ");
        String name = scanner.next();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        //create product object
        Product product = new Product(productId, name, price, quantity);

        //display product details
        product.displayDetails();
        System.out.println("Total value: " + product.calculateTotalValue());
    }
}
