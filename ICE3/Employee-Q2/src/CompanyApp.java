public class CompanyApp {

    public static void main(String[] args) {
        Company comp = new Company();
        System.out.println("Average salary of married employees: " + computeAvgSalaryOfMarriedEmployees(comp));
        System.out.println(areSalariesAllHigherThan(comp, 1000));
        System.out.println(areSalariesAllHigherThan(comp, 2000));
        System.out.println(areSalariesAllHigherThan(comp, 5000));
    }

    // This method should return the average salary of married employees (i.e.,
    // employees who have a spouse) in the given company.
    // The average salary is defined as follows:
    //      total salary of married employees
    //   --------------------------------------
    //      total number of married employees
    //
    // If the number of married employees in this company is 0, this method should return 0.0.
    public static double computeAvgSalaryOfMarriedEmployees(Company comp) {
        int marriedSpouseCount = 0;
        double marriedSpouseSalary = 0.0;
        for (int i=1;i<=comp.getMaxEmployeeID();i++) {
            if (comp.getEmployee(i).getSpouse() != null) {
                marriedSpouseSalary += comp.getEmployee(i).getSalary();
                marriedSpouseCount++;
            }
        }
        if (marriedSpouseCount == 0) {
            return 0.0;
        } else {
            return marriedSpouseSalary / marriedSpouseCount;
        }
    }


    // This method returns true if ALL the employees in the given company have a salary strictly
    // higher than the given mininum salary; otherwise it returns false.
    // If the company does not have any employee, the method returns true.
    public static boolean areSalariesAllHigherThan(Company comp, double minSalary) {
        int count = 0;
        for (int i=1;i<=comp.getMaxEmployeeID();i++) {
            if (comp.getEmployee(i).getSalary() > minSalary) {
                count++;
            }
        }
        if (count == comp.getMaxEmployeeID()) {
            return true;
        } else {
            return false;
        }
    }
}
