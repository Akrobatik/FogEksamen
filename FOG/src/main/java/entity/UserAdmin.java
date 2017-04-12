package entity;

/**
 *
 * @author Anders
 */
public class UserAdmin {
    private int idAdmin;
    private String username;
    private String password;
    private String firstname;
    private String lastname;

    public UserAdmin(int idAdmin, String username, String password, String firstname, String lastname) {
        this.idAdmin = idAdmin;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public UserAdmin(int idAdmin, String username, String password) {
        this.idAdmin = idAdmin;
        this.username = username;
        this.password = password;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
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

    @Override
    public String toString() {
        return "UserAdmin{" + "idAdmin=" + idAdmin + ", username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }

    
}
