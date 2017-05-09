package model.data;

import model.db.DataBase;
import model.entity.UserSuperAdmin;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.entity.UserAdmin;

/**
 *
 * @author Anders
 */
public class UserSuperAdminMapper {
    public UserSuperAdmin validateSuperAdmin(String username, String password) throws UserFeedbackException {
        try {
            String sql = "select * from SuperAdmin where username = ? and password = ?";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()) {
                int idSuperAdmin = rs.getInt("idSuperAdmin");
                return new UserSuperAdmin(idSuperAdmin, username, password);
            }
        } catch (SQLException ex) {
            throw new UserFeedbackException("Username or password did not match" + ex.getMessage());
        }
        return null;
    }
    
    public void addUserAdmin(String username, String password, String firstname, String lastname) throws ToLogException {
        try {
        String sql = "insert into Admin (username, password, firstname, lastname) values(?, ? , ?, ?)";
        
        PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        pstmt.setString(3, firstname);
        pstmt.setString(4, lastname);
        pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new ToLogException("Error in addUserAdmin" + ex.getMessage());
        }
    }
    
    public void deleteUserAdmin(int idAdmin) throws ToLogException {
        try {
            String sql = "delete from Admin where idAdmin = ?";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setInt(1, idAdmin);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    
    public List<UserAdmin> getAdmins() throws ToLogException {
        List<UserAdmin> usera = new ArrayList<>();
        try {
            String sql = "select idAdmin, username, password, firstname, lastname from Admin";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                UserAdmin ua = new UserAdmin(rs.getInt("idAdmin"), rs.getString("username"), rs.getString("password"), rs.getString("firstname"), rs.getString("lastname"));
                usera.add(ua);
            }
            return usera;
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
}
