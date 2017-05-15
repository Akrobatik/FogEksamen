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
public class DataFacade implements IDataFacade{
    
    UserMapper um = new UserMapper();
    UserAdminMapper uam = new UserAdminMapper();
    UserSuperAdminMapper usam = new UserSuperAdminMapper();
    OrderMapper om = new OrderMapper();
    
    @Override
    public void addUser(String username, String password, String firstname, String lastname, int tlf, String email) throws ToLogException {
        um.addUser(username, password, firstname, lastname, tlf, email);
    }

    @Override
    public User validateUser(String username, String password) throws ToLogException, UserFeedbackException {
        return um.validateUser(username, password);
    }

    @Override
    public UserAdmin validateAdmin(String username, String password) throws UserFeedbackException {
        return uam.validateAdmin(username, password);
    }
    //Få hjælp her
    @Override
    public List<User> getUsers() throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserSuperAdmin validateSuperAdmin(String username, String password) throws UserFeedbackException {
        return usam.validateSuperAdmin(username, password);
    }

    @Override
    public void addUserAdmin(String username, String password, String firstname, String lastname) throws ToLogException {
        usam.addUserAdmin(username, password, firstname, lastname);
    }

    @Override
    public void deleteUserAdmin(int idAdmin) throws ToLogException {
        usam.deleteUserAdmin(idAdmin);
    }
    //Få hjælp her
    @Override
    public List<UserAdmin> getAdmins() throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrder(String roofType, double width, double length, double height, int idUser) throws ToLogException {
        om.addOrder(roofType, width, length, height, idUser);
    }

    @Override
    public void deleteOrder(int idOrder) throws ToLogException {
        om.deleteOrder(idOrder);
    }
    //Få hjælp her
    @Override
    public List<Order> getOrders() throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Få hjælp her
    @Override
    public List<Order> getUserOrder(User user) throws ToLogException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
