package co.edu.unac.oop2.registry;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private JLabel lblID;
    private JLabel lblPassword;
    private JTextField txtID;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JPanel pnlLogin;

    private static final String FILEPATH = "users.txt";
    private static final String COMMA = ",";

    private List<User> users = new ArrayList<User>();

    public JPanel getPnlLogin() {
        return pnlLogin;
    }

    public Login() {

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                loadData();
                if (users.size() > 0) {
                    List<User> userLookup = users.stream()
                            .filter(u -> u.getId().equals(txtID.getText()) && u.getPassword().equals(new String(txtPassword.getPassword())))
                            .toList();
                    if (userLookup.size() > 0) {
                        JOptionPane.showMessageDialog(null, "Bienvenido, " + userLookup.get(0).getNames() + " " + userLookup.get(0).getLastNames(), "INFO", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario y/o contraseña no coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay usuarios", "ALERTA", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private void loadData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILEPATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(COMMA);
                User user = new User(columns[0], columns[1], columns[2], columns[3], columns[4]);
                users.add(user);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
