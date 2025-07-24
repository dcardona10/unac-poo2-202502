package co.edu.unac.oop2.personal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.println("Inserting persona information: ");
        System.out.print("Name: ");
        persona.name = scan.next();
        System.out.print("ID: ");
        persona.id = scan.next();
        System.out.print("ID Type: ");
        persona.idType = scan.next();
        System.out.print("Age: ");
        persona.age = scan.nextInt();

        System.out.println("Persona info: " + persona.showPersonaInfo());
        System.out.println("Is of Legal Age: " + persona.isOfLegalAge());
    }
}
