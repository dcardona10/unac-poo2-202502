package co.edu.unac.oop2.registry;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SignUp {
    private JPanel pnlSignUp;
    private JLabel lblNames;
    private JLabel lblLastNames;
    private JLabel lblIDType;
    private JLabel lblPassword;
    private JTextField txtNames;
    private JTextField txtLastNames;
    private JComboBox cmbIDType;
    private JPasswordField txtPassword;
    private JButton btnCreateUser;
    private JLabel lblID;
    private JTextField txtID;

    private static final String FILEPATH = "users.txt";
    private static final String COMMA = ",";

    public JPanel getPnlSignUp() {
        return pnlSignUp;
    }

    public SignUp() {

        cmbIDType.addItem("CC");
        cmbIDType.addItem("CE");
        cmbIDType.addItem("TI");

        btnCreateUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (PrintWriter writer = new PrintWriter(new FileWriter(FILEPATH))) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(txtNames.getText())
                            .append(COMMA)
                            .append(txtLastNames.getText())
                            .append(COMMA)
                            .append(cmbIDType.getSelectedItem())
                            .append(COMMA)
                            .append(txtID.getText())
                            .append(COMMA)
                            .append(new String(txtPassword.getPassword()));
                    writer.println(stringBuilder.toString());
                    JOptionPane.showMessageDialog(null, "Usuario creado exitosamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
