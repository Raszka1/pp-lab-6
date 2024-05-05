import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker2 = new Worker("Szczepan", 800, 2);
        Worker worker3 = new Worker("Dźimi", 2137, 3);
        Worker worker4 = new Worker("Jan Matejko", 4580, 4);
        Worker worker1 = new Worker("Tony Stark", 20000, 1);
        
        Manager manager = new Manager("Krystian", 6140, 5);
        
        worker1.work();
        System.out.println("Salary of worker1: " + worker1.getSalary());

        worker2.work();
        System.out.println("Salary of worker2: " + worker2.getSalary());

        worker3.work();
        System.out.println("Salary of worker3: " + worker3.getSalary());

        worker4.work();
        System.out.println("Salary of worker4: " + worker4.getSalary());

        manager.work();
        System.out.println("Salary of manager: " + manager.getSalary());
    }
}