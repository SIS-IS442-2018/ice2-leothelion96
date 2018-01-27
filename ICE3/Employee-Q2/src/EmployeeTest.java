import java.util.*;

public class EmployeeTest {

    public static void main(String[] args) {

        // Test the constructors
        Employee e1 = new Employee("Eric Tan", 1, 2000, 'm');
        Employee e2 = new Employee("Kelly Wong", 2, 2500, 'f', "Harry Yeo", 39);

        Employee e3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of a new employee: ");
        String name = sc.nextLine();

        System.out.print("Enter his/her salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the gender: ");
        char gender = sc.next().charAt(0);

        System.out.print("Does he/she has a spouse? [Y|N] ");
        char answer = sc.next().charAt(0);
        sc.nextLine();

        if (answer == 'Y') {
            System.out.print("Enter the spouse's name: ");
            String spouseName = sc.nextLine();
            System.out.print("Enter the spouse's age: ");
            int spouseAge = sc.nextInt();

            e3 = new Employee(name, 3, salary, gender, spouseName, spouseAge);
        } else {
            e3 = new Employee(name, 3, salary, gender);
        }

        // Test the getter methods
        System.out.println();
        System.out.println("Employee 3:");
        System.out.println("\tName: " + e3.getName());
        System.out.println("\tSalary: $" + e3.getSalary());
        Spouse sp3 = e3.getSpouse();
        if (sp3 != null) {
            System.out.println("\tSpouse's name: " + sp3.getName());
            System.out.println("\tSpouse's age: " + sp3.getAge());
        }

        // Test the setter methods
        System.out.println();
        System.out.println("Employee 2's salary: $" + e2.getSalary());
        e2.setSalary(3000);
        System.out.println("After the change, Employee 2's salary: $" + e2.getSalary());

        e1.setSpouse(new Spouse("Cindy Lim", 32));
        Spouse sp1 = e1.getSpouse();
        System.out.println();
        System.out.println("Employee 1's spouse:" );
        if (sp1 != null) {
            System.out.println("\tName: " + sp1.getName());
            System.out.println("\tAge: " + sp1.getAge());
        } else {
            System.out.println("\tError!");
        }

        // Test the spouseYoungerThan method
        System.out.println();
        if (e1.spouseYoungerThan(e2)) {
            System.out.println("Employee 1's spouse is younger than Employee 2's spouse.");
        }

        if (e2.spouseYoungerThan(e3)) {
            System.out.println("Employee 2's spouse is younger than Employee 3's spouse.");
        }

        if (e2.spouseYoungerThan(null)) {
            System.out.println("Your program has an error!");
        }
    }

}
