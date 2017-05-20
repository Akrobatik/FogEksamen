/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import model.data.interfaces.IUserDataFacade;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import model.entity.User;

/**
 *
 * @author Anders
 */
public class UserDataFacade implements IUserDataFacade{

    UserMapper um = new UserMapper();
    
    @Override
    public void addUser(String username, String password, String firstname, String lastname, int tlf, String email) throws ToLogException {
        um.addUser(username, password, firstname, lastname, tlf, email);
    }

    @Override
    public User validateUser(String username, String password) throws ToLogException, UserFeedbackException {
        return um.validateUser(username, password);
    }

    @Override
    public void deleteUser(int idUser) throws ToLogException {
        um.deleteUser(idUser);
    }
    
}
