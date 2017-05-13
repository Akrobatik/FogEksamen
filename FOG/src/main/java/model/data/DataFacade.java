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
public class DataFacade implements IDataFacade {
    OrderMapper om = new OrderMapper();
    UserAdminMapper uam = new UserAdminMapper();
    UserSuperAdminMapper usam = new UserSuperAdminMapper();

    @Override
    public void addOrder(String roofType, double width, double length, double height, int idUser) throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteOrder(int idOrder) throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Order> getOrders() throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Order> getUserOrder(User user) throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserAdmin validateAdmin(String username, String password) throws UserFeedbackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getUsers() throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User validateUser(String username, String password) throws ToLogException, UserFeedbackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addUser(String username, String password, String firstname, String lastname, int tlf, String email) throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserSuperAdmin validateSuperAdmin(String username, String password) throws UserFeedbackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addUserAdmin(String username, String password, String firstname, String lastname) throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUserAdmin(int idAdmin) throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserAdmin> getAdmins() throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
