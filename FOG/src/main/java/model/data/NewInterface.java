/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.util.List;
import model.entity.Order;
import model.entity.User;
import model.entity.UserAdmin;
import model.entity.UserSuperAdmin;

/**
 *
 * @author Anders
 */
public interface NewInterface {

    void addUser(String username, String password, String firstname, String lastname, int tlf, String email) throws ToLogException;

    User validateUser(String username, String password) throws ToLogException, UserFeedbackException;
    
    UserAdmin validateAdmin(String username, String password) throws UserFeedbackException;
    
    List<User> getUsers() throws ToLogException;
    
    UserSuperAdmin validateSuperAdmin(String username, String password) throws UserFeedbackException;
    
    void addUserAdmin(String username, String password, String firstname, String lastname) throws ToLogException;
    
    void deleteUserAdmin(int idAdmin) throws ToLogException;
    
    List<UserAdmin> getAdmins() throws ToLogException;
    
    void addOrder(String roofType, double width, double length, double height, int idUser) throws ToLogException;
    
    void deleteOrder(int idOrder) throws ToLogException;
    
    List<Order> getOrders() throws ToLogException;
    
    List<Order> getUserOrder(User user) throws ToLogException;
}
