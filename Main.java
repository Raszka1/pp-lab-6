import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam", 1550, 1, "2021-02-17", "Junior DevOps");
        Worker worker2 = new Worker("Andrzej", 1200, 2, "2019-06-28", "Senior Master Head Developer");
        Worker worker3 = new Worker("Antoni", 2400, 3, "2018-11-13", "Tester");
        Worker worker4 = new Worker("Agnieszka", 7100, 4, "2021-07-13", "Project Manager");
        Worker worker5 = new Worker("Anakin", 4040, 3, "2021-08-17", "Project Owner"); // Nowa instancja Worker z tym
                                                                                      // samym id co worker3
        Manager manager1 = new Manager("Alan", 7000, 5, "2017-01-13", "Boss");
        Manager manager2 = new Manager("Andzelika", 55000, 1, "2020-07-17", "FBI"); // Nowa instancja Manager z tym samym id
                                                                              // co worker1

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        // Mapa do przechowywania pracowników o tym samym id
        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
            // Sprawdź, czy pracownik o tym samym id już istnieje w mapie
            if (idMap.containsKey(emp.getId())) {
                idMap.get(emp.getId()).add(emp);
            } else {
                List<Employee> empList = new ArrayList<>();
                empList.add(emp);
                idMap.put(emp.getId(), empList);
            }
        }

        // Wyświetlanie informacji o sumach pensji
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total manager salary: " + totalManagerSalary);
        System.out.println("Total worker salary: " + totalWorkerSalary);

        // Wyświetlanie pracowników o tym samym id
        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            List<Employee> empList = entry.getValue();
            if (empList.size() > 1) {
                System.out.println("Employees with same ID: ");
                for (Employee emp : empList) {
                    System.out.println("- " + emp.getName());
                }
            }
        }
    }
}