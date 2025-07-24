package co.edu.unac.oop2.personal;

public class Persona {

    public String name;
    public String id;
    public String idType;
    public int age;

    public String showPersonaInfo() {
        return "[Name: " + name + ", "
                + "ID: " + id + ", "
                + "ID Type: " + idType + ", "
                + "Age: " + age + "]";
    }

    public boolean isOfLegalAge() {
        return age >= 18;
    }
}
