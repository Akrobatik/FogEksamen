/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.interfaces;

import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.util.List;
import model.entity.User;
import model.entity.UserAdmin;

/**
 *
 * @author Anders
 */
public interface IUserAdminDomainFacade {
    UserAdmin validateAdmin(String username, String password) throws UserFeedbackException;
    
    List<User> getUsers() throws ToLogException;
}
