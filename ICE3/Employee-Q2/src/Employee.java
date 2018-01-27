public class Employee {

    private String name;
    private int employeeId;
    private double salary;
    private char gender;
    private Spouse spouse;

    public Employee(String name, int employeeId, double salary, char gender) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.gender = gender;
        this.spouse  = null;
    }

    public Employee(String name, int employeeId, double salary, char gender, String spouseName, int spouseAge) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.gender = gender;
        this.spouse = new Spouse(spouseName, spouseAge);
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(int employeeId) {

        this.employeeId = employeeId;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {

        this.gender = gender;
    }

    public Spouse getSpouse() {

        return spouse;
    }

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
    }

    public boolean spouseYoungerThan(Employee another) {
        try {
            if (getSpouse().getAge() < another.getSpouse().getAge()) {
                return true;
            } else {
                return false;
            }
        }
        catch (NullPointerException e) {
            return false;
        }
    }


}
