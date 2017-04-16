package mapper;

import db.DataBase;
import entity.Order;
import exceptions.ToLogException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anders
 */
public class OrderMapper {
    public void addOrder(String roofType, double width, double length, double heigth) throws ToLogException {
        try {
            String sql = "insert into Order(roofType, width, length, heigth) values(?, ?, ?, ?)";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            pstmt.setString(1, "roofType");
            pstmt.setDouble(2, width);
            pstmt.setDouble(3, length);
            pstmt.setDouble(4, heigth);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    
    public void deleteOrder() throws ToLogException {
        try {
            String sql = "";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    
    public void editOrder() throws ToLogException {
        try {
            String sql = "";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
    
    public List<Order> getOrders() throws ToLogException {
        List<Order> order = new ArrayList<>();
        try {
            String sql = "select roofType, width, length, heigth from Order";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Order o = new Order(rs.getString("roofType"), rs.getDouble("width"), rs.getDouble("length"), rs.getDouble("heigth"));
                order.add(o);
            }
            return order;
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
}
