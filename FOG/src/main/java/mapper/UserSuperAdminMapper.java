package mapper;

import db.DataBase;
import entity.UserSuperAdmin;
import exceptions.UserFeedbackException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
