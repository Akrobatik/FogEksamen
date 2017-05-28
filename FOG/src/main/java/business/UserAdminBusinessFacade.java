/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.interfaces.IUserAdminDomainFacade;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.util.List;
import model.data.UserAdminDataFacade;
import model.entity.User;
import model.entity.UserAdmin;

/**
 *
 * @author Anders
 */
public class UserAdminBusinessFacade implements IUserAdminDomainFacade{
    
    UserAdminDataFacade audf = new UserAdminDataFacade();

    @Override
    public UserAdmin validateAdmin(String username, String password) throws UserFeedbackException {
        return audf.validateAdmin(username, password);
    }

    @Override
    public List<User> getUsers() throws ToLogException {
        return audf.getUsers();
    }
    
}
