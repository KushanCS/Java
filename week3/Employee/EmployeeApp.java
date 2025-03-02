package employee;

import java.util.Scanner;

public class EmployeeApp {
    //getting inputs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employee_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String employee_name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic_salary = sc.nextDouble();

        System.out.print("Enter Rate(1-5): ");
        int rate = sc.nextInt();

        //creating employee object
        Employee emp = new Employee(employee_id, employee_name, basic_salary, rate);

        //display employee details
        System.out.println("");
        System.out.println("Employee Details");
        System.out.println("Employee ID: "+ emp.getEmployee_id());
        System.out.println("Name: "+emp.getEmployee_name());
        System.out.println("Basic Salary: "+emp.getBasic_salary());
        System.out.println("Performance Rating: "+emp.getRate());
        System.out.println("Bonus:"+emp.calculateBonus());
        System.out.println("Total Salary: "+emp.calculateTotalSalary());

        sc.close();
    }
}
