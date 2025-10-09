package co.edu.unac.oop2.library;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Library {
    private JPanel pnlLibrary;
    private JLabel lblTitle;
    private JLabel lblIsbn;
    private JLabel lblAuthor;
    private JLabel lblEditorial;
    private JLabel lblYear;
    private JTextField txtTitle;
    private JTextField txtIsbn;
    private JTextField txtAuthor;
    private JTextField txtEditorial;
    private JTextField txtYear;
    private JButton btnAdd;
    private JTable tblBooks;

    private String[] columns = {"Título", "ISBN", "Autor", "Editorial", "Año"};
    private DefaultTableModel model = new DefaultTableModel(columns, 0);

    public Library() {

        tblBooks.setModel(model);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!txtTitle.getText().isEmpty()
                        && !txtIsbn.getText().isEmpty()
                        && !txtAuthor.getText().isEmpty()
                        && !txtEditorial.getText().isEmpty()
                        && !txtYear.getText().isEmpty()) {
                    model.addRow(new Object[]{txtTitle.getText(), txtIsbn.getText(), txtAuthor.getText(), txtEditorial.getText(), txtYear.getText()});
                    JOptionPane.showMessageDialog(null, "Libro agregado exitosamente", "OK", JOptionPane.INFORMATION_MESSAGE);
                    clearData();
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public JPanel getPnlLibrary() {
        return pnlLibrary;
    }

    private void clearData() {
        txtTitle.setText("");
        txtIsbn.setText("");
        txtAuthor.setText("");
        txtEditorial.setText("");
        txtYear.setText("");
    }
}
