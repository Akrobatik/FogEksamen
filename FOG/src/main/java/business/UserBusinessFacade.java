/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.interfaces.IUserDomainFacade;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.util.List;
import model.data.UserDataFacade;
import model.entity.User;

/**
 *
 * @author Anders
 */
public class UserBusinessFacade implements IUserDomainFacade{
    
    UserDataFacade udf = new UserDataFacade();

    @Override
    public void addUser(String username, String password, String firstname, String lastname, int tlf, String email) throws ToLogException {
        udf.addUser(username, password, firstname, lastname, tlf, email);
    }

    @Override
    public User validateUser(String username, String password) throws ToLogException, UserFeedbackException {
        return udf.validateUser(username, password);
    }

    @Override
    public void deleteUser(int idUser) throws ToLogException {
        udf.deleteUser(idUser);
    }

    @Override
    public List<User> getUser(User user) throws ToLogException {
        return udf.getUser(user);
    }
}
