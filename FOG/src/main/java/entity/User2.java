package entity;

/**
 *
 * @author Anders
 */
public class User2 {
    private int id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private int tlf;
    private String email;
    
    public User2() {
    }
    
    public User2(int id, String username, String password, String firstname, String lastname, int tlf, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.tlf = tlf;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User2{" + "id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname=" + lastname + ", tlf=" + tlf + ", email=" + email + '}';
    }
}
