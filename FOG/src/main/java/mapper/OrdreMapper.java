/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import db.DataBase;
import entity.Customer;
import entity.Ordre;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anders
 */
public class OrdreMapper {
    public ArrayList<Ordre> getOrdre() {
        ArrayList<Ordre> ordre = new ArrayList<>();
        System.out.println("Before String sql");
        try {
            String sql = "select * from ordre";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                int ordreId = rs.getInt("OrderId");
                double width = rs.getDouble("Width");
                double height = rs.getDouble("Height");
                int nails = rs.getInt("Nails");
                int planks = rs.getInt("Planks");
                String shed = rs.getString("Shed");
                ordre.add(new Ordre(ordreId, width, height, nails, planks, shed));
            }
            
            return ordre;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        return null;
    }
            
}
