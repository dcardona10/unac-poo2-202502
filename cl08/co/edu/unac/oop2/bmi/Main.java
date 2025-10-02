package co.edu.unac.oop2.bmi;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(400, 400);
        frame.setContentPane(new BMICalculator().getPnlMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
