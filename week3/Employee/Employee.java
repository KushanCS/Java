package employee;

public class Employee {

    private int employee_id;
    private String employee_name;
    private double basic_salary;
    private int rate;

    //constructor
    public Employee(int employee_id, String employee_name, double basic_salary, int rate) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.basic_salary = basic_salary;
        this.rate = rate;
    }

    //getter for  employee id
    public int getEmployee_id() {
        return employee_id;
    }

    //setter for employee_name
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    //getter for employee name
    public String getEmployee_name() {
        return employee_name;
    }

    //getter for employee salary
    public double getBasic_salary() {
        return basic_salary;
    }

    public int getRate() {
        return rate;
    }
    //methods to calculate the salary

    public double calculateBonus() {
        double bonus = 0.0;
        switch (this.rate) {
            case 1:
                bonus = basic_salary * 0.0;
                break;

            case 2:
                bonus = basic_salary * 0.05;
                break;

            case 3:
                bonus = basic_salary * 0.1;
                break;

            case 4:
                bonus = basic_salary * 0.15;
                break;

            case 5:
                bonus = basic_salary * 0.2;
                break;

            default:
                System.out.println("Invalid rate! Setting bonus to 0.");
        }
        return bonus;
    }

    public double calculateTotalSalary() {
        double bonus = calculateBonus();
        return basic_salary + bonus;
    }


}


