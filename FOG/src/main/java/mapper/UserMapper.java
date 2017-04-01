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
public class UserMapper {
    public User getUser(int UserId) throws Exception{
        String sql = "SELECT UserId, UserName, UserPassword FROM user WHERE UserId = ?";
        try {
            PreparedStatement pstmt = DataBase.getPreparedStatement(sql);
            pstmt.setInt(1, UserId);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return new User(UserId, rs.getString("UserName"), rs.getString("UserPassword"));
            }     
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ToLogException("Error in getUser()"+ex.getMessage());
        }
        throw new Exception("No user by that ID");
    }
    
    public String verifyUser(String UserName, String UserPassword) throws ToLogException, UserFeedbackException{
        try{
            String sql = "SELECT UserId, UserName, UserPassword FROM user WHERE UserName = ? AND Password = ?";
            PreparedStatement pstmt = DataBase.getPreparedStatement(sql);
            pstmt.setString(1, UserName);
            pstmt.setString(2, UserPassword);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return UserName;
            }
        }catch (SQLException | ClassNotFoundException ex) {
            throw new ToLogException("Error in verifyUser(): "+ex.getMessage());
        }
        throw new UserFeedbackException("Username or password did not match");
    }
}
