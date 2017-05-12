package model.entity;

/**
 *
 * @author Anders
 */
public class User implements NewInterface {
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
    
    @Override
    public int getIdUser() {
        return idUser;
    }

    @Override
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int getTlf() {
        return tlf;
    }

    @Override
    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User2{" + "idUser=" + idUser + ", username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname=" + lastname + ", tlf=" + tlf + ", email=" + email + '}';
    }
}
