public class Main {

    public static void main(String[] args) {
	//Task 2. Employees hierarchy. First version
        Firm firm = new Firm();
        /*
        firm.addEmployee(new Employee("Andrey", 5000, "CEO"),0);
        firm.addEmployee(new Employee("Sergey", 3000, "developer"),1);
        firm.addEmployee(new Employee("Katya", 2500, "developer"), 2);
        firm.addEmployee(new Employee("Vasya", 1800, "developer"), 3);
        firm.addEmployee(new Employee("Sveta", 2000, "BA"), 4);
        firm.addEmployee(new Employee("Gena", 1000, "BA"), 5);
        firm.addEmployee(new Employee("Sasha", 800, "QA"), 6);
        firm.addEmployee(new Employee("Lena", 600, "QA"), 7);

        System.out.println(firm.calculateSalary());
        */
        // Second version without index, foreach
        firm.addEmployee(new Employee("Andrey", 5000, "CEO"));
        firm.addEmployee(new Employee("Sergey", 3000, "developer"));
        firm.addEmployee(new Employee("Katya", 2500, "developer"));
        firm.addEmployee(new Employee("Vasya", 1800, "developer"));
        firm.addEmployee(new Employee("Sveta", 2000, "BA"));
        firm.addEmployee(new Employee("Gena", 1000, "BA"));
        firm.addEmployee(new Employee("Sasha", 800, "QA"));
        firm.addEmployee(new Employee("Lena", 600, "QA"));
        System.out.println(firm.calculateSalary());




    }
}
