package co.edu.unac.oop2.ex2;

public class Employee {

    public String id;
    public String idType;
    public String name;
    public double salary;

    public String showEmployeeData() {
        return "[ID: " + id + ", ID Type: " + idType + ", Name: " + name + ", salary = $" + salary + "]";
    }
}
