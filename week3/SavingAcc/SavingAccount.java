import java.util.Scanner;

public class SavingAccount{

    private int accountNumber;

    private String accountHolderName;

    private double balance;

    //constructor
    public SavingAccount(int accountNumber, String accountHolderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    //getter for accountNumber
    public int getAccountNumber(){
        return accountNumber;
    }

    //setter for accountHolderName
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    //getter for balance
    public double getBalance(){
        return balance;
    }

    //methods to deposit amount
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
        System.out.println("Deposited " + amount + " New Balance: " + balance);
    }

    //method to withdraw
    public void withdraw(double amount){
        if ( balance >= amount){
            if (balance > 0){
                balance -= amount;
                if (balance > 0){
                    System.out.println("Withdrawn: " + amount + " New Balance: " + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Insufficient balance");
            balance = balance;
        }
    }

    //method to display account details
    public void displayAccountDetails(){
        System.out.println("");
        System.out.println("Final Account Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //getting user inputs
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder name: ");
        String accountHolderName = sc.next();
        System.out.print("Enter Initial Deposit: ");
        double initialBalance = sc.nextDouble();
        System.out.println("Deposited " + initialBalance + " New Balance: " + initialBalance);

        SavingAccount account = new SavingAccount(accountNumber, accountHolderName, initialBalance);

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        account.deposit(amount);

        System.out.print("Enter withdraw amount: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        account.displayAccountDetails();

    }

}
