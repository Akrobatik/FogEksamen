/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class UserMapper2 {
    public User validateUser(String UserName, String UserPassword) throws ToLogException, UserFeedbackException
    {
        try
        {
            String sql = "select * from user where UserName = ? and UserPassword = ?";

            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setString(1, UserName);
            pstmt.setString(2, UserPassword);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next())
            {
                int UserId = rs.getInt("UserId");
                //double balance = rs.getDouble("balance");
                return new User(UserId, UserName, UserPassword);
            }

        }
        catch (SQLException ex)
        {
            throw new UserFeedbackException("Username or password did not match" + ex.getMessage());  
            //throw new ToLogException("Error in validateUser(): " + ex.getMessage());
        }
        return null;
    }
}
