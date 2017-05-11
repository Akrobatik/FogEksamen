/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import java.util.List;
import model.entity.User;
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
        // TODO review the generated test code and remove the default call to fail.
       
    }

 
   
    
}
