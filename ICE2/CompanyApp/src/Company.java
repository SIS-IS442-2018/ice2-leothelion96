import java.util.ArrayList;


public class Company
{
    private ArrayList<Employee> employees;

    public Company()
    {
        employees = new ArrayList();
        employees.add(new Employee("Alice", 1, 1300.0D, 'F'));
        employees.add(new Employee("Brenda", 2, 1500.0D, 'M', new Spouse("Frank", 35)));
        employees.add(new Employee("Chris", 3, 2400.0D, 'M', new Spouse("Emily", 29)));
        employees.add(new Employee("Darren", 4, 3000.0D, 'M'));
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
        for (int i = 0; i < employees.size(); i++) {
            if (((Employee)employees.get(i)).getEmployeeId() == paramInt) {
                return (Employee)employees.get(i);
            }
        }
        return null;
    }







    public int numberOfEmployeesWithGender(char paramChar)
    {
        int i = 0;
        for (int j = 0; j < employees.size(); j++) {
            if (((Employee)employees.get(j)).getGender() == paramChar) {
                i++;
            }
        }
        return i;
    }
}
