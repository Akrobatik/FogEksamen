package model.entity;

/**
 *
 * @author Anders
 */
public class Order {
    private int idOrder;
    private String roofType;
    private double width;
    private double length;
    private double height;
    private int User_idUser;

    public Order(int idOrder, String roofType, double width, double length, double height) {
        this.idOrder = idOrder;
        this.roofType = roofType;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Order(String roofType, double width, double length, double height, int User_idUser) {
        this.roofType = roofType;
        this.width = width;
        this.length = length;
        this.height = height;
        this.User_idUser = User_idUser;

    }

    public Order(int idOrder, String roofType, double width, double length, double height, int User_idUser) {
        this.idOrder = idOrder;
        this.roofType = roofType;
        this.width = width;
        this.length = length;
        this.height = height;
        this.User_idUser = User_idUser;
    }
    
    public int getUser_idUser() {
        return User_idUser;
    }

    public void setUser_idUser(int User_idUser) {
        this.User_idUser = User_idUser;
    }
    
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Order{" + "idOrder=" + idOrder + ", roofType=" + roofType + ", width=" + width + ", length=" + length + ", height=" + height + ", User_idUser=" + User_idUser + '}';
    }
}
