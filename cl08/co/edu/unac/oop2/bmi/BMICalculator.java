package co.edu.unac.oop2.bmi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator {

    private JPanel pnlMain;
    private JLabel lblWeight;
    private JLabel lblHeight;
    private JTextField txtWeight;
    private JTextField txtHeight;
    private JButton btnCaculate;

    public BMICalculator() {

        btnCaculate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.valueOf(txtWeight.getText());
                    double height = Double.valueOf(txtHeight.getText());
                    double bmi = weight / Math.pow(height, 2);
                    JOptionPane.showMessageDialog(null, "Your Body Mass Index (BMI) is " + String.format("%.2f", bmi), "INFO", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public JPanel getPnlMain() {
        return pnlMain;
    }
}
