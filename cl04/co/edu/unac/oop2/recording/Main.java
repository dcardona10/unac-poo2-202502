package co.edu.unac.oop2.recording;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Personal personal = new Personal();
        try {
            System.out.println("Insert person data: ");
            System.out.print("ID: ");
            personal.setId(sc.next());
            System.out.print("Name: ");
            personal.setName(sc.next());
            System.out.print("Email: ");
            personal.setEmail(sc.next());
            System.out.print("Phone: ");
            personal.setPhone(sc.next());
            System.out.println(personal.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
