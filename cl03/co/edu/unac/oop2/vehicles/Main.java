package co.edu.unac.oop2.vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Scanner sc = new Scanner(System.in);
        int option = -1;

        while(option != 0) {

            System.out.println("Select an option for vehicle");
            System.out.println("1. Car");
            System.out.println("2. Motorcycle");
            System.out.println("3. Truck");
            System.out.println("4. Show Fleet");
            System.out.println("0. Exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Car car = new Car();
                    System.out.print("Maker: ");
                    car.setMaker(sc.next());
                    System.out.print("Model: ");
                    car.setModel(sc.next());
                    System.out.print("Year: ");
                    car.setYear(sc.nextInt());
                    System.out.print("Doors: ");
                    car.setDoors(sc.nextInt());
                    vehicles.add(car);
                    break;
                case 2:
                    Motorcycle motorcycle = new Motorcycle();
                    System.out.print("Maker: ");
                    motorcycle.setMaker(sc.next());
                    System.out.print("Model: ");
                    motorcycle.setModel(sc.next());
                    System.out.print("Year: ");
                    motorcycle.setYear(sc.nextInt());
                    System.out.print("Displacement: ");
                    motorcycle.setDisplacement(sc.nextInt());
                    vehicles.add(motorcycle);
                    break;
                case 3:
                    Truck truck = new Truck();
                    System.out.print("Maker: ");
                    truck.setMaker(sc.next());
                    System.out.print("Model: ");
                    truck.setModel(sc.next());
                    System.out.print("Year: ");
                    truck.setYear(sc.nextInt());
                    System.out.print("Load Capacity: ");
                    truck.setLoadCapacity(sc.nextDouble());
                    vehicles.add(truck);
                    break;
                case 4:
                    vehicles.forEach(v -> {
                        v.showInfo();
                        System.out.println("Maintenance Rate: " + v.calculateMaintenanceRate());
                    });
                    break;
            }
        }
    }
}
