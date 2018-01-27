






public class Employee
{
    private String name;
    private int employeeId;
    private double salary;
    private char gender;
    private Spouse spouse;

    public Employee(String paramString, int paramInt, double paramDouble, char paramChar)
    {
        name = paramString;
        employeeId = paramInt;
        salary = paramDouble;
        gender = paramChar;
        spouse = null;
    }








    public Employee(String paramString, int paramInt, double paramDouble, char paramChar, Spouse paramSpouse)
    {
        name = paramString;
        employeeId = paramInt;
        salary = paramDouble;
        gender = paramChar;
        spouse = paramSpouse;
    }




    public String getName()
    {
        return name;
    }




    public int getEmployeeId()
    {
        return employeeId;
    }




    public double getSalary()
    {
        return salary;
    }




    public char getGender()
    {
        return gender;
    }




    public Spouse getSpouse()
    {
        return spouse;
    }
}
