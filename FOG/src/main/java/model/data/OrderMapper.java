package model.data;

import model.db.DataBase;
import model.entity.Order;
import exceptions.ToLogException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.entity.User;

/**
 *
 * @author Anders
 */
public class OrderMapper {
    public void addOrder(String roofType, double width, double length, double height, int idUser) throws ToLogException {
        try {
            String sql = "insert into `Order`(roofType, width, length, height, User_idUser) "
                    + "values(?, ?, ?, ?, ?)";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setString(1, roofType);
            pstmt.setDouble(2, width);
            pstmt.setDouble(3, length);
            pstmt.setDouble(4, height);
            pstmt.setInt(5, idUser);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    
    public void deleteOrder(int idOrder) throws ToLogException {
        try {
            String sql = "delete from `Order` where idOrder = ?";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setInt(1, idOrder);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    // editOrder skal muligvis omskrives, da der er tvivl om koden
    public void editOrder() throws ToLogException {
        try {
            String sql = "update `Order` set roofType = ?, width = ?, length = ?, height = ? where idOrder = ?";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    
    public List<Order> getOrders() throws ToLogException {
        List<Order> order = new ArrayList<>();
        try {
            String sql = "select roofType, width, length, height, User_idUser from `Order`";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Order o = new Order(rs.getString("roofType"), rs.getDouble("width"), rs.getDouble("length"), rs.getDouble("height"), rs.getInt("User_idUser"));
                order.add(o);
            }
            return order;
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    
    public List<Order> getUserOrder(User user) throws ToLogException {
        List<Order> order = new ArrayList<>();
        try {
            String sql = "select idOrder, roofType, width, length, height, User_idUser from `Order` where User_idUser = ?";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setInt(1, user.getIdUser());
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Order o = new Order(rs.getInt("idOrder"), rs.getString("roofType"), rs.getDouble("width"), rs.getDouble("length"), rs.getDouble("height"), rs.getInt("User_idUser") );
                order.add(o);
            }
            return order;
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
}
