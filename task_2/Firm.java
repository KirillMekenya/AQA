import java.util.ArrayList;

public class Firm {

    private Employee [] employees = new Employee[8];
    private int allSalary;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee (Employee employee, int index)
    {

        this.employees[index] = employee;
    }

    public int calculateSalary ()
    {
        for (Employee employee: this.employees
             ) {
            this.allSalary+=employee.getSalary();
        }
        return this.allSalary;

    }
}
