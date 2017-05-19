/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.interfaces.IUserSuperAdminDomainFacade;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.util.List;
import model.data.UserSuperAdminDataFacade;
import model.entity.UserAdmin;
import model.entity.UserSuperAdmin;

/**
 *
 * @author Anders
 */
public class UserSuperAdminDomainFacade implements IUserSuperAdminDomainFacade{
    
    UserSuperAdminDataFacade usadf = new UserSuperAdminDataFacade();

    @Override
    public void addUserAdmin(String username, String password, String firstname, String lastname) throws ToLogException {
        usadf.addUserAdmin(username, password, firstname, lastname);
    }

    @Override
    public void deleteUserAdmin(int idAdmin) throws ToLogException {
        usadf.deleteUserAdmin(idAdmin);
    }

    @Override
    public List<UserAdmin> getAdmins() throws ToLogException {
        return usadf.getAdmins();
    }

    @Override
    public UserSuperAdmin validateSuperAdmin(String username, String password) throws UserFeedbackException {
        return usadf.validateSuperAdmin(username, password);
    }
    
}
