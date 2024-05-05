import java.util.ArrayList;
import company.models.Menager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Andrzej", 7080, 1, "2023-05-14", "CEO");
        Worker worker2 = new Worker("Grażyna", 6600, 2, "2021-04-17", "Mid Developer");
        Worker worker3 = new Worker("Steave", 3700, 3, "2022-02-18", "Project Manager");
        Worker worker4 = new Worker("Jarvis", 5200, 4, "2020-12-19", "Tester");

        Menager manager = new Menager("Krystian", 74000, 5, "2014-05-05", "Son");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.getId() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}