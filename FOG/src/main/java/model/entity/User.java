package model.entity;

/**
 *
 * @author Anders
 */
public class User {
    private int idUser;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private int tlf;
    private String email;
    
    public User() {
    }
    
    public User(int idUser, String username, String password, String firstname, String lastname, int tlf, String email) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.tlf = tlf;
        this.email = email;
    }
    
    public User(String username, String firstname, String lastname, int tlf, String email) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.tlf = tlf;
        this.email = email;
    }
    
    public User(int idUser, String username, String password) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
    }

    public User(int idUser, String username, String firstname, String lastname, int tlf, String email) {
        this.idUser = idUser;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.tlf = tlf;
        this.email = email;
    }
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "User2{" + "idUser=" + idUser + ", username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname=" + lastname + ", tlf=" + tlf + ", email=" + email + '}';
    }
}
