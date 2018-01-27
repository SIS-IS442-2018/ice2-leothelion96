import java.util.ArrayList;

public class Company
{
    private ArrayList<Employee> employees;

    public Company()
    {
        employees = new ArrayList();
        employees.add(new Employee("Alice", 1, 1300.0D, 'F'));
        employees.add(new Employee("Brenda", 2, 1500.0D, 'M', "Frank", 35));
        employees.add(new Employee("Chris", 3, 2400.0D, 'M', "Emily", 29));
        employees.add(new Employee("Darren", 4, 3000.0D, 'M'));
        employees.add(new Employee("Eric", 5, 3200.0D, 'M', "Wendy", 38));
        employees.add(new Employee("Fanny", 6, 3500.0D, 'F'));
    }

    public void addEmployee(Employee paramEmployee)
    {
        employees.add(paramEmployee);
    }

    public double getCompanySalary()
    {
        double d = 0.0D;
        for (int i = 0; i < employees.size(); i++) {
            d += ((Employee)employees.get(i)).getSalary();
        }
        return d;
    }

    public Employee getEmployee(int paramInt)
    {
        if ((paramInt < 1) || (paramInt > employees.size())) {
            return null;
        }
        return (Employee)employees.get(paramInt - 1);
    }

    public int getMaxEmployeeID()
    {
        return employees.size();
    }
}
