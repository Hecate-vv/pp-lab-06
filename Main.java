import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Natasza",3400.0, 1, "02-07-1976", "IT Specialist");
        Worker worker2 = new Worker("Bartolomeo", 2200.0, 2, "02-07-1976", "IT Specialist");
        Worker worker3 = new Worker("Lila", 1945.0, 3, "01-04-2000", "Background Artist");
        Worker worker4 = new Worker("Mint", 2012.0, 4, "05-05-2024", "Functional Tester");
        Worker worker5 = new Worker("Wojciech", 2600, 6, "19-07-1988", "Web Developer");
        Worker worker6 = new Worker("Bogumisława", 1900, 7, "04-07-2007", "Tester");
        Worker worker7 = new Worker("Ala", 3000, 7, "04-07-2007", "Senior Tester");
        Worker worker8 = new Worker("0la", 2000, 8, "05-10-2010", "Tester");
        Worker worker9 = new Worker("Ela", 2000, 9, "05-10-2010", "Tester");
        Manager manager1 = new Manager("Michał", 5489, 5, "20-02-2020", "HR Manager");
        Manager manager2 = new Manager("Wiktoria", 6000, 7, "21-06-2021", "Project Manager");
        Manager manager3 = new Manager("Błażej", 5500, 11, "12-12-2020", "Community Manager");

        double totalSalaryAllWorkers = 0;
        double totalSalaryAllManagers = 0;
        double totalSalaryAllEmployees = 0;
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(worker7);
        employees.add(worker8);
        employees.add(worker9);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

         for (Employee employee : employees) {
            totalSalaryAllEmployees += employee.getSalary();
            if (employee instanceof Manager) {
                totalSalaryAllManagers += employee.getSalary();
            }
            if (employee instanceof Worker) {
                totalSalaryAllWorkers += employee.getSalary();
            }
        }
        System.out.println("Total salary of all workers: " + totalSalaryAllWorkers);
        System.out.println("Total salary of all managers: " + totalSalaryAllManagers);
        System.out.println("Total salary of all employees: " + totalSalaryAllEmployees);
        for (Employee employee : employees) {
            for (Employee otherEmployee : employees) {
                if (employee != otherEmployee && employee.hashCode() == otherEmployee.hashCode()) {
                    System.out.println("Found matching IDs: " + employee.getName() + " and " + otherEmployee.getName());
                }
            }
        }
    }
}
