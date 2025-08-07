package co.edu.unac.oop2.figures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("Select figure to calculate area");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("0. Exit");
            option = sc.nextInt();

            switch(option) {
                case 1:
                    Square square = new Square();
                    System.out.print("Base: ");
                    square.setBase(sc.nextDouble());
                    square.setData("[Base: " + square.getBase() + "]");
                    System.out.println("Area: " + square.getArea());
                    square.showFigureData();
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    System.out.print("Base: ");
                    rectangle.setBase(sc.nextDouble());
                    System.out.print("Height: ");
                    rectangle.setHeight(sc.nextDouble());
                    rectangle.setData("[Base: " + rectangle.getBase() + ", Height: " + rectangle.getHeight() + "]");
                    System.out.println("Area: " + rectangle.getArea());
                    rectangle.showFigureData();
                    break;
                case 3:
                    Triangle triangle = new Triangle();
                    System.out.print("Base: ");
                    triangle.setBase(sc.nextDouble());
                    System.out.print("Height: ");
                    triangle.setHeight(sc.nextDouble());
                    triangle.setData("[Base: " + triangle.getBase() + ", Height: " + triangle.getHeight() + "]");
                    System.out.println("Area: " + triangle.getArea());
                    triangle.showFigureData();
                    break;
                case 4:
                    Circle circle = new Circle();
                    System.out.print("Radius: ");
                    circle.setBase(sc.nextDouble());
                    circle.setData("[Radius: " + circle.getBase() + "]");
                    System.out.println("Area: " + circle.getArea());
                    circle.showFigureData();
                    break;
            }
        }
    }
}
