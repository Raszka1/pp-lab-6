import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam", 100, 1, "2020-12-11", "Senior Developer");
        Worker worker2 = new Worker("Kuba", 2100, 2, "2021-04-07", "Junior Developer");
        Worker worker3 = new Worker("Dawid", 2300, 1, "2020-12-09", "Tester"); // Ten sam id co worker1
        Manager manager = new Manager("Stefam", 75200, 3, "2014-05-05", "SFO");

        //HashCode() dla każdego pracownika
        System.out.println(manager.getName() + " has code: " + manager.hashCode());
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());

        // Wywołanie metody equals() dla worker3 aby go porównać 
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager));
        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
    }
}