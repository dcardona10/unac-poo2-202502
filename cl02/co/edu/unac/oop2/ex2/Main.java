package co.edu.unac.oop2.ex2;

import co.edu.unac.oop2.ex1.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int option = -1;
        List<Employee> employees = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);

        while (option != 0) {
            System.out.println("Options:");
            System.out.println("1. Insert employee");
            System.out.println("2. Search by ID");
            System.out.println("3. Select employees by salary range");
            System.out.println("0. Exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Employee employee = new Employee();
                    System.out.print("ID: ");
                    employee.id = sc.next();
                    System.out.print("ID Type: ");
                    employee.idType = sc.next();
                    System.out.print("Name: ");
                    employee.name = sc.next();
                    System.out.print("Salary: ");
                    employee.salary = sc.nextDouble();
                    employees.add(employee);
                    break;
                case 2:
                    System.out.print("Insert ID: ");
                    String searchId = sc.next();
                    Employee employeeSearch = employees.stream()
                            .filter(e -> e.id.equals(searchId))
                            .collect(Collectors.toList()).get(0);
                    System.out.println(employeeSearch.showEmployeeData());
                    break;
                case 3:
                    System.out.print("Minimum salary: ");
                    int minSalary = sc.nextInt();
                    System.out.print("Maximum salary: ");
                    int maxSalary = sc.nextInt();
                    List<Employee> employeeFilter = employees.stream()
                            .filter(s -> s.salary >= minSalary && s.salary <= maxSalary)
                            .collect(Collectors.toList());
                    employeeFilter.sort(Comparator.comparing(e -> e.salary));
                    employeeFilter.forEach(sf -> System.out.println(sf.showEmployeeData()));
                    break;
            }
        }
    }
}
