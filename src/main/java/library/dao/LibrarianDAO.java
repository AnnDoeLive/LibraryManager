package library.dao;

import library.model.Librarian;
import java.sql.*;

public class LibrarianDAO {

    public Librarian login(String username, String password) {
        String sql = "SELECT * FROM librarians WHERE username=? AND password=?";

        try (PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Librarian(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
