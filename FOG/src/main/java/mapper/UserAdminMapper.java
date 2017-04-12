package mapper;

import db.DataBase;
import entity.Order;
import entity.User;
import entity.User2;
import entity.UserAdmin;
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
public class UserAdminMapper {
    public UserAdmin validateAdmin(String username, String password) throws UserFeedbackException {
        try {
            String sql = "select * from Admin where username = ? and password = ?";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()) {
                int idAdmin = rs.getInt("idAdmin");
                return new UserAdmin(idAdmin, username, password);
            }
        } catch (SQLException ex) {
            throw new UserFeedbackException("Username or password did not match" + ex.getMessage());
        }
        return null;
    }
    
    public List<User2> getUsers() throws ToLogException {
        List<User2> users = new ArrayList<>();
        try {
            String sql = "select username, firstname, lastname, tlf, email from User";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                User2 u = new User2(rs.getString("username"), rs.getString("firstname"), rs.getString("lastname"), rs.getInt("tlf"), rs.getString("email"));
                users.add(u);
            }
            return users;
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    
    public List<Order> getOrders() throws ToLogException {
        List<Order> order = new ArrayList<>();
        try {
            String sql = "select roofType, width, length, heigth from Order";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Order o = new Order(rs.getString("roofType"), rs.getDouble("width"), rs.getDouble("length"), rs.getDouble("heigth"));
                order.add(o);
            }
            return order;
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
}
