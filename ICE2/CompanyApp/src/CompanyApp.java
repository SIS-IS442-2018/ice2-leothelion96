import java.util.Scanner;

public class CompanyApp {

    public static void checkEmployee(Company comp, int id) {
        Employee e0  = comp.getEmployee(id);
        System.out.println("The name of this employee is: " + e0.getName() + " & the salary is: $" + e0.getSalary());
        //Check if employee has spouse
        if(e0.getSpouse() != null) {
            System.out.println("The name of the spouse is: " + e0.getSpouse().getName());
        } else {
            System.out.println("He/she doesn't have a spouse.");
        }
    }

    public static void main (String args[]) {
        Company c = new Company();
        Spouse s = new Spouse("Kate",37);
        Employee e = new Employee("John", 5, 2500D, 'M', s);
        c.addEmployee(e);
        //Print Total Salary
        System.out.println("Total Salary: " + c.getCompanySalary());

        //Prompt user - Name
        System.out.print("Enter Employee Name: ");
        Scanner scName = new Scanner(System.in);
        String empName = scName.nextLine();

        //Prompt user - ID (Numerical)
        System.out.print("Enter Employee ID: ");
        Scanner scId = new Scanner(System.in);
        int empID = scId.nextInt();

        //Prompt user - salary (Double)
        System.out.print("Enter Employee Salary: ");
        Scanner scSalary = new Scanner(System.in);
        double empSalary = scSalary.nextDouble();

        //Prompt user - gender(char)
        System.out.print("Enter Employee Gender (M/F): ");
        Scanner scGender = new Scanner(System.in);
        char empGender = scGender.nextLine().charAt(0);
        //Adding to the pool of Employees
        Employee e2 = new Employee(empName, empID, empSalary, empGender);
        c.addEmployee(e2);

        //Print updated total salary
        System.out.println("Updated Total Salary: " + c.getCompanySalary());

        checkEmployee(c,4);
        checkEmployee(c,5);

        /*Employee e3  = c.getEmployee(4);
        System.out.println("The name of this employee is: " + e3.getName() + " & the salary is: $" + e3.getSalary());
        //Check if employee has spouse
        if(e3.getSpouse() != null) {
            System.out.println("The name of the spouse is: " + e3.getSpouse().getName());
        } else {
            System.out.println("He/she doesn't have a spouse.");
        }*/
    }
}
