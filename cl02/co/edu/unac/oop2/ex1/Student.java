package co.edu.unac.oop2.ex1;

public class Student {

    public String id;
    public String name;
    public int age;

    public String showStudentData() {
        return "Student[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ']';
    }
}
