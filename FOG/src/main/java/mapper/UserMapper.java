package mapper;

import db.DataBase;
import entity.User;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anders
 */
public class UserMapper {
    // koden skal omskrives så den passer med entity.Order klassen
    public User validateUser(String UserName, String UserPassword) throws ToLogException, UserFeedbackException {
        try {
            String sql = "select * from user where UserName = ? and UserPassword = ?";

            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setString(1, UserName);
            pstmt.setString(2, UserPassword);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                int UserId = rs.getInt("UserId");
                return new User(UserId, UserName, UserPassword);
            }
        } catch (SQLException ex) {
            throw new UserFeedbackException("Username or password did not match" + ex.getMessage());  
        }
        return null;
    }
    
    public void addUser(String username, String password, String firstname, String lastname, int tlf, String email) throws ToLogException {
        try {
        String sql = "insert into User (username, password, firstname, lastname, tlf, email) values(?, ? , ?, ?, ?, ?)";
        
        PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        pstmt.setString(3, firstname);
        pstmt.setString(4, lastname);
        pstmt.setInt(5, tlf);
        pstmt.setString(6, email);
        pstmt.executeQuery();
        } catch (SQLException ex) {
            throw new ToLogException("Error in addUser" + ex.getMessage());
        }
    }
    
}
