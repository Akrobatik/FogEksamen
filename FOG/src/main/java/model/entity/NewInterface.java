/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author Anders
 */
public interface NewInterface {

    String getEmail();

    String getFirstname();

    int getIdUser();

    String getLastname();

    String getPassword();

    int getTlf();

    String getUsername();

    void setEmail(String email);

    void setFirstname(String firstname);

    void setIdUser(int idUser);

    void setLastname(String lastname);

    void setPassword(String password);

    void setTlf(int tlf);

    void setUsername(String username);

    String toString();
    
}
