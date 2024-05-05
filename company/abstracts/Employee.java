package company.abstracts;

//Import interfacu
import company.interfaces.Employable;

public abstract class Employee implements Employable {
    //Prywatne zmienne
    private String name;
    private double salary;
    private int id;

    //Konstruktor
    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    //Metody
    public String getName() {
        return name;
    }
 
    public double getSalary() {
        return salary;
    }
}