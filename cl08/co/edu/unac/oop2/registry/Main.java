package co.edu.unac.oop2.registry;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /*JFrame signUpFrame = new JFrame("Registro de Usuarios");
        signUpFrame.setSize(400, 400);
        signUpFrame.setContentPane(new SignUp().getPnlSignUp());
        signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpFrame.setVisible(true);*/

        JFrame loginFrame = new JFrame("Inicio de sesión");
        loginFrame.setSize(400, 400);
        loginFrame.setContentPane(new Login().getPnlLogin());
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setVisible(true);
    }
}
