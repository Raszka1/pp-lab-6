package company.models;

import company.abstracts.Employee;

public class Menager extends Employee {
    public Menager(String name, double salary, int id, String hireDate, String position) {
        super(name, salary, id, hireDate, position);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");
    }
}