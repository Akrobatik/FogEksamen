/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import exceptions.ToLogException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.db.DataBase;
import model.entity.Productline;

/**
 *
 * @author Anders
 */
public class ProductlineMapper {
    public List<Productline> getProductline() throws ToLogException {
        List<Productline> productline = new ArrayList<>();
        try {
            String sql = "select idStorage, description, type, name, price from Productline";
            
            PreparedStatement pstmt = DataBase.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Productline pl = new Productline(rs.getInt("idStorage"), rs.getString("description"), rs.getString("type"), rs.getString("name"), rs.getDouble("price"));
                productline.add(pl);
            }
            return productline;
        } catch (SQLException ex) {
            throw new ToLogException("" + ex.getMessage());
        }
    }
}
