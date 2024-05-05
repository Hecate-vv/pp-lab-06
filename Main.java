import company.models.Manager;
import company.models.Worker;
import java.util.ArrayList;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Natasza", 3400.0, 1, "02-07-1976", "IT Specialist");
        Worker worker2 = new Worker("Bartolomeo", 2200.0, 2, "02-07-1976", "IT Specialist");
        Worker worker3 = new Worker("Lila", 1945.0, 3, "01-04-2000", "Background Artist");
        Worker worker4 = new Worker("Mint", 2012.0, 4, "05-05-2024", "Functional Tester");
        Manager manager = new Manager("Michał", 5489, 5, "20-02-2020", "HR Manager");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);
        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
        }
    }
}