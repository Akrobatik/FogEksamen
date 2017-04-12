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
    public void addOrder() throws ToLogException{
        try {
            
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
