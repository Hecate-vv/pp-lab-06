import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Natasza",3400.0, 1, "02-07-1976", "IT Specialist");
        Worker worker2 = new Worker("Bartolomeo", 2200.0, 2, "02-07-1976", "IT Specialist");
        Worker worker3 = new Worker("Lila", 1945.0, 3, "01-04-2000", "Background Artist");
        Worker worker4 = new Worker("Mint", 2012.0, 4, "05-05-2024", "Functional Tester");
        Worker worker5 = new Worker("Wojciech", 2600, 6, "19-07-1988", "Web Developer");
        Worker worker6 = new Worker("Bogumisława", 1900, 7, "04-07-2007", "Tester");
        Worker worker7 = new Worker("Ala", 3000, 7, "04-07-2007", "Senior Tester");
        Manager manager = new Manager("Michał", 5489, 5, "20-02-2020", "HR Manager");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(worker4.getName() + " has code: " + worker4.hashCode());
        System.out.println(worker5.getName() + " has code: " + worker4.hashCode());
        System.out.println(worker6.getName() + " has code: " + worker4.hashCode());
        System.out.println(worker7.getName() + " has code: " + worker4.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker6.getName() + " equals worker1: " + worker6.equals(worker1));
        System.out.println(worker6.getName() + " equals worker2: " + worker6.equals(worker2));
        System.out.println(worker6.getName() + " equals worker3: " + worker6.equals(worker3));
        System.out.println(worker6.getName() + " equals worker4: " + worker6.equals(worker4));
        System.out.println(worker6.getName() + " equals worker5: " + worker6.equals(worker5));
        System.out.println(worker6.getName() + " equals worker7: " + worker6.equals(worker7));
        System.out.println(worker6.getName() + " equals manager: " + worker6.equals(manager));
    }
}