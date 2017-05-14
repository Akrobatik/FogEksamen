/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.db.DataBase;
import model.entity.User;

/**
 *
 * @author Anders
 */
public class NewClass implements NewInterface{
    
    UserMapper um = new UserMapper();
    
    @Override
    public void addUser(String username, String password, String firstname, String lastname, int tlf, String email) throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
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
    
}
