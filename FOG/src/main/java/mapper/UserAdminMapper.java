package mapper;

import db.DataBase;
import entity.UserAdmin;
import exceptions.UserFeedbackException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
