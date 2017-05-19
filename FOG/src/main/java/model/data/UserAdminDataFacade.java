/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import model.data.interfaces.IUserAdminDataFacade;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.util.List;
import model.entity.User;
import model.entity.UserAdmin;

/**
 *
 * @author Anders
 */
public class UserAdminDataFacade implements IUserAdminDataFacade{
    
    UserAdminMapper uam = new UserAdminMapper();

    @Override
    public UserAdmin validateAdmin(String username, String password) throws UserFeedbackException {
        return uam.validateAdmin(username, password);
    }

    @Override
    public List<User> getUsers() throws ToLogException {
        return uam.getUsers();
    }
}
