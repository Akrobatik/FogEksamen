/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import model.data.interfaces.IUserSuperAdminDataFacade;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.util.List;
import model.entity.UserAdmin;
import model.entity.UserSuperAdmin;

/**
 *
 * @author Anders
 */
public class UserSuperAdminDataFacade implements IUserSuperAdminDataFacade{
    
    UserSuperAdminMapper usam = new UserSuperAdminMapper();

    @Override
    public void addUserAdmin(String username, String password, String firstname, String lastname) throws ToLogException {
        usam.addUserAdmin(username, password, firstname, lastname);
    }

    @Override
    public void deleteUserAdmin(int idAdmin) throws ToLogException {
        usam.deleteUserAdmin(idAdmin);
    }

    @Override
    public List<UserAdmin> getAdmins() throws ToLogException {
        return usam.getAdmins();
    }

    @Override
    public UserSuperAdmin validateSuperAdmin(String username, String password) throws UserFeedbackException {
        return usam.validateSuperAdmin(username, password);
    }
    
}
