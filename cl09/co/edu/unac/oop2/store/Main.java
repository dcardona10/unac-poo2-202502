package co.edu.unac.oop2.store;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Store");
        frame.setSize(300, 300);
        frame.setContentPane(new Store().getPnlStore());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
