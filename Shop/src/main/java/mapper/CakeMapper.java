package mapper;

import connector.DBConnector;
import entity.Bottom;
import entity.Top;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CakeMapper
{
    public ArrayList<Top> getTops()
    {
        ArrayList<Top> tops = new ArrayList();
        
        try
        {
            String sql = "select * from top";

            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                tops.add(new Top(id, name, price));
            }
            
            return tops;

        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        return null;
    }
    
    public ArrayList<Bottom> getBottoms()
    {
        ArrayList<Bottom> bottoms = new ArrayList();
        
        try
        {
            String sql = "select * from bottom";

            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                bottoms.add(new Bottom(id, name, price));
            }
            
            return bottoms;

        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        return null;
    }
}
