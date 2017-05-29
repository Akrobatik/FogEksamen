/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import model.entity.UserAdmin;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class UserAdminMapperTest {
    
    public UserAdminMapperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testValidateAdmin() throws Exception {
        System.out.println("validateAdmin");
        String username = "Emil";
        String password = "Emil123";
        UserAdminMapper instance = new UserAdminMapper();
        
        UserAdmin result = instance.validateAdmin(username, password);
        assertEquals("Emil", result.getUsername());
        assertEquals("Emil123", result.getPassword());
       
    }

//    @Test
//    public void testValidateAdmin2() throws Exception {
//        System.out.println("validateAdmin");
//        String username = "Emile12";
//        String password = "hej";
//        UserAdminMapper instance = new UserAdminMapper();
//        
//        UserAdmin result = instance.validateAdmin(username, password);
//        assertEquals("Emile12", result.getUsername());
//        assertEquals("hej", result.getPassword());
//    }
}