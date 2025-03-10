import java.util.Scanner;
public class employeeSalary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //user inputs
        System.out.print("Enter employee type (1,2 or 3):");
        int employeeType = sc.nextInt();

        System.out.print("Enter Basic Salary \t\t\t  :");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter Overtime Hours(otHours) :");
        int otHours = sc.nextInt();

        //determine  Overtime Rate (OtRate)
        int otRate;
        switch(employeeType){
            case 1:
                otRate = 1000;
                break;
            case 2:
                otRate = 1500;
                break;
            case 3:
                otRate = 1700;
                break;
            default:
                System.out.println("Invalid Employee type. Please enter(1,2 or 3)");
                return;
        }
        //calculate total salary
        double totalSalary = basicSalary + otRate * otHours;

        //print
        System.out.println("Total Salary is \t\t\t  :" + totalSalary);
    }
}
