/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Anders
 */
public class DataBase {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://138.68.88.237:3306/FOG";
    private static String user = "SuperFOGUser";
    private static String password = "SuperFOG123";
    private static Connection conn = null;

    public static Connection getConnection()
    {
        if (conn == null)
        {
            try
            {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, user, password);
            }
            catch (ClassNotFoundException ex)
            {
                ex.printStackTrace();
            }
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
        
        return conn;
    }
    
    public static PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException{
        return getConnection().prepareStatement(sql);
    }
}
