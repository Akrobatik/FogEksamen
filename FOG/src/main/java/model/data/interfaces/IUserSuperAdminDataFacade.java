/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data.interfaces;

import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.util.List;
import model.entity.UserAdmin;
import model.entity.UserSuperAdmin;

/**
 *
 * @author Anders
 */
public interface IUserSuperAdminDataFacade {
    void addUserAdmin(String username, String password, String firstname, String lastname) throws ToLogException;

    void deleteUserAdmin(int idAdmin) throws ToLogException;

    List<UserAdmin> getAdmins() throws ToLogException;

    UserSuperAdmin validateSuperAdmin(String username, String password) throws UserFeedbackException;
}
