package co.edu.unac.oop2.store;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Store {
    private JPanel pnlStore;
    private JLabel lblCode;
    private JLabel lblDescription;
    private JLabel lblQuantity;
    private JLabel lblPrice;
    private JTextField txtCode;
    private JTextField txtDescription;
    private JTextField txtQuantity;
    private JTextField txtPrice;
    private JButton btnAdd;
    private JTable tblProducts;
    private JButton btnExport;

    private String[] columns = {"Code", "Description", "Quantity", "Price"};
    private DefaultTableModel model = new DefaultTableModel(columns, 0);

    public Store() {

        tblProducts.setModel(model);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtCode.getText().isEmpty()
                && !txtDescription.getText().isEmpty()
                && !txtQuantity.getText().isEmpty()
                && !txtPrice.getText().isEmpty()) {
                    model.addRow(new Object[]{txtCode.getText(), txtDescription.getText(), txtQuantity.getText(), txtPrice.getText()});
                    JOptionPane.showMessageDialog(null, "Product successfully added", "Info", JOptionPane.INFORMATION_MESSAGE);
                    clearData();
                } else {
                    JOptionPane.showMessageDialog(null, "Please complete all fields", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btnExport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser chooser = new JFileChooser();
                chooser.setDialogTitle("Save CSV file");
                int option = chooser.showSaveDialog(null);

                if (option == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                        for (int i = 0; i < model.getRowCount(); i++) {
                            writer.println(model.getValueAt(i, 0) + "," +
                                    model.getValueAt(i, 1) + "," +
                                    model.getValueAt(i, 2) + "," +
                                    model.getValueAt(i, 3));
                        }
                        JOptionPane.showMessageDialog(null, "File saved successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Failed to save file", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    public JPanel getPnlStore() {
        return pnlStore;
    }

    private void clearData() {
        txtCode.setText("");
        txtDescription.setText("");
        txtQuantity.setText("");
        txtPrice.setText("");
    }
}
