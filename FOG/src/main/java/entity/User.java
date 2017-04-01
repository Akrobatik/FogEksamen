/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Anders
 */
public class User {
    private int UserId;
    private String UserName;
    private String UserPassword;
    private String UserFirstName;
    private String UserLastName;
    private int UserRole;
    
    public User() {
    }
    
    public User(int UserId, String UserName, String UserPassword, String UserFirstName, String UserLastName, int UserRole) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.UserPassword = UserPassword;
        this.UserFirstName = UserFirstName;
        this.UserLastName = UserLastName;
        this.UserRole = UserRole;
    }
    
    public User(int UserID, String UserName, String UserPassword) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.UserPassword = UserPassword;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String UserFirstName) {
        this.UserFirstName = UserFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String UserLastName) {
        this.UserLastName = UserLastName;
    }

    public int getUserRole() {
        return UserRole;
    }

    public void setUserRole(int UserRole) {
        this.UserRole = UserRole;
    }

    @Override
    public String toString() {
        return "User{" + "UserId=" + UserId + ", UserName=" + UserName + ", UserPassword=" + UserPassword + ", UserFirstName=" + UserFirstName + ", UserLastName=" + UserLastName + ", UserRole=" + UserRole + '}';
    }
}
