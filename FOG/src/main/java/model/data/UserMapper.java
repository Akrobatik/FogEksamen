package model.data;

import model.db.DataBase;
import model.entity.User;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anders
 */
public class UserMapper {
    public User validateUser(String username, String password) throws ToLogException, UserFeedbackException {
        try {
            String sql = "select * from User where username = ? and password = ?";

            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                int idUser = rs.getInt("idUser");
                return new User(idUser, username, password);
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
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new ToLogException("Error in addUser" + ex.getMessage());
        }
    }
    
    public void deleteUser(int idUser) throws ToLogException {
        try {
            String sql = "delete from User where idUser = ?"; 
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setInt(1, idUser);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    
    public List<User> getUser(User user) throws ToLogException{
        List<User> user2 = new ArrayList<>();
        try {
            String sql = "select idUser, username, password, firstname, lastname, tlf, email where idUser = ?";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setInt(1, user.getIdUser());
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                User u = new User(rs.getInt("idUser"), rs.getString("username"), rs.getString("password"), rs.getString("firstname"), rs.getString("lastname"), rs.getInt("tlf"), rs.getString("email"));
                user2.add(u);
            }
            return user2;
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
}
