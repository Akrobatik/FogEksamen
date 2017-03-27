package mapper;

import connector.DBConnector;
import entity.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper
{
    public Customer validateCustomer(String name, String password)
    {
        try
        {
            String sql = "select * from customer where name = ? and password = ?";

            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next())
            {
                int id = rs.getInt("id");
                double balance = rs.getDouble("balance");
                return new Customer(id, name, password, balance);
            }

        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        return null;
    }
}
