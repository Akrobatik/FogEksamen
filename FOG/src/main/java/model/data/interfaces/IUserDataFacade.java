/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data.interfaces;

import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.util.List;
import model.entity.User;

/**
 *
 * @author Anders
 */
public interface IUserDataFacade {
    void addUser(String username, String password, String firstname, String lastname, int tlf, String email) throws ToLogException;

    User validateUser(String username, String password) throws ToLogException, UserFeedbackException;
    
    void deleteUser(int idUser) throws ToLogException;
    
    List<User> getUser(User user) throws ToLogException;
}
