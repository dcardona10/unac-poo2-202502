package co.edu.unac.oop2.dao;

import co.edu.unac.oop2.model.Author;
import co.edu.unac.oop2.sql.SQLConstants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO {

    private static Connection connection;

    private static final String AUTHOR_SELECT = "SELECT author_id, name FROM author";
    private static final String AUTHOR_CREATE = "INSERT INTO author VALUES (?, ?)";

    public AuthorDAO() {
        if (connection == null) {
            try {
                Class.forName(SQLConstants.SQL_DB_CLASS);
                connection = DriverManager.getConnection(SQLConstants.SQL_CONNECTION, SQLConstants.SQL_USER, SQLConstants.SQL_PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Author> getAuthors() {

        List<Author> authors = new ArrayList<Author>();
        try {
            PreparedStatement statement = connection.prepareStatement(AUTHOR_SELECT);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                Author author = new Author();
                author.setAuthorId(result.getString("author_id"));
                author.setName(result.getString("name"));
                authors.add(author);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return authors;
    }

    public void createAuthor(Author author) {

        try {
            PreparedStatement statement = connection.prepareStatement(AUTHOR_CREATE);
            statement.setString(1, author.getAuthorId());
            statement.setString(2, author.getName());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
