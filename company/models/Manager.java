package company.models;

//Import Klasy abstrakcyjnej
import company.abstracts.Employee;

//Klasa Finalna 
public class Manager extends Employee {
    public Manager(String name, double salary, int id) {
        super(name, salary, id);
    }

    //Nadpisanie
    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");
    }
}