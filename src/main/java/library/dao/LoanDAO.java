package library.dao;

import library.model.Loan;
import java.sql.*;
import java.sql.Date;
import java.util.*;

public class LoanDAO {

    public boolean insert(Loan l) {
        String sql = "INSERT INTO loans(bookId, memberId, borrowDate, returnDate, status) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql)) {

            ps.setInt(1, l.getBookId());
            ps.setInt(2, l.getMemberId());
            ps.setDate(3, Date.valueOf(l.getBorrowDate()));
            ps.setDate(4, Date.valueOf(l.getReturnDate()));
            ps.setString(5, l.getStatus());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
