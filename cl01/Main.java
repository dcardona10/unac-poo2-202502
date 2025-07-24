import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
        System.out.println("Inserting vehicle details: ");
        System.out.print("Engine: ");
        vehicle.engine = scan.next();
        System.out.print("Engine Size: ");
        vehicle.engineSize = scan.nextInt();
        System.out.print("Wheel Number: ");
        vehicle.wheelNumber = scan.nextInt();
        System.out.print("Maker: ");
        vehicle.maker = scan.next();
        System.out.print("Model: ");
        vehicle.model = scan.next();
        System.out.print("Year: ");
        vehicle.year = scan.nextInt();
        System.out.println("");

        vehicle.showCarCharacteristics();
        System.out.println("Is Electric/Hybrid?: " + vehicle.isElectricOrHybrid());
    }
}
