package co.edu.unac.oop2.ex1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int option = -1;
        List<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        while (option != 0) {
            System.out.println("Options:");
            System.out.println("1. Insert student");
            System.out.println("2. Sort students by age");
            System.out.println("3. Select students by age range");
            System.out.println("4. Show total students");
            System.out.println("0. Exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Student student = new Student();
                    System.out.print("ID: ");
                    student.id = sc.next();
                    System.out.print("Name: ");
                    student.name = sc.next();
                    System.out.print("Age: ");
                    student.age = sc.nextInt();
                    students.add(student);
                    break;
                case 2:
                    students.sort(Comparator.comparing(a -> a.age));
                    students.forEach(s -> System.out.println(s.showStudentData()));
                    break;
                case 3:
                    System.out.print("Minimum age: ");
                    int minAge = sc.nextInt();
                    System.out.print("Maximum age: ");
                    int maxAge = sc.nextInt();
                    List<Student> studentFilter = students.stream()
                            .filter(s -> s.age >= minAge && s.age <= maxAge)
                            .collect(Collectors.toList());
                    studentFilter.forEach(sf -> System.out.println(sf.showStudentData()));
                    break;
                case 4:
                    System.out.println("Total students: " + students.size());
                    break;
            }
        }
    }
}
