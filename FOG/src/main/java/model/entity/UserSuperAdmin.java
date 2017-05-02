package model.entity;

/**
 *
 * @author Anders
 */
public class UserSuperAdmin {
    private int idSuperAdmin;
    private String username;
    private String password;

    public UserSuperAdmin(int idSuperAdmin, String username, String password) {
        this.idSuperAdmin = idSuperAdmin;
        this.username = username;
        this.password = password;
    }

    public int getIdSuperAdmin() {
        return idSuperAdmin;
    }

    public void setIdSuperAdmin(int idSuperAdmin) {
        this.idSuperAdmin = idSuperAdmin;
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

    @Override
    public String toString() {
        return "UserSuperAdmin{" + "idSuperAdmin=" + idSuperAdmin + ", username=" + username + ", password=" + password + '}';
    }
}
