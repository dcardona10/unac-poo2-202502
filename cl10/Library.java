import co.edu.unac.oop2.dao.AuthorDAO;
import co.edu.unac.oop2.model.Author;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

public class Library {
    private JPanel pnlLibrary;
    private JTabbedPane tabLibrary;
    private JPanel pnlAuthors;
    private JPanel pnlBooks;
    private JLabel lblName;
    private JTextField txtName;
    private JButton btnCreateAuthor;
    private JTable tblAuthors;

    private String[] columns = {"ID", "Name"};
    private DefaultTableModel model = new DefaultTableModel(columns, 0);

    private AuthorDAO authorDAO;

    public Library() {

        loadData();

        btnCreateAuthor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    authorDAO = new AuthorDAO();
                    Author author = new Author();
                    author.setAuthorId(UUID.randomUUID().toString());
                    author.setName(txtName.getText());
                    authorDAO.createAuthor(author);
                    loadData();
                    txtName.setText("");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getPnlLibrary() {
        return pnlLibrary;
    }

    private void loadData() {

        tblAuthors.setModel(model);
        authorDAO = new AuthorDAO();

        try {
            for (Author author : authorDAO.getAuthors()) {
                model.addRow(new Object[] {author.getAuthorId(), author.getName()});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
