import company.models.Manager;
import company.models.Worker;
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Natasza", 3400.0, 1);
        Worker worker2 = new Worker("Bartolomeo", 2200.0, 2);
        Worker worker3 = new Worker("Lila", 1945.0, 3);
        Worker worker4 = new Worker("Mint", 2012.0, 4);
        Manager manager = new Manager("Michał", 5489, 5);

        System.out.println("Salary of worker 1: " + worker1.getSalary());
        System.out.println("Salary of worker 2: " + worker2.getSalary());
        System.out.println("Salary of worker 3: " + worker3.getSalary());
        System.out.println("Salary of worker 4: " + worker4.getSalary());

        worker1.work();
        worker2.work();
        worker3.work();
        worker4.work();
        manager.work();
    }
}