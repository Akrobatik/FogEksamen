/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import model.entity.User;
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
public class UserMapperTest {
    
    public UserMapperTest() {
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
    public void testValidateUser() throws Exception {
        System.out.println("validateUser");
        String username = "Anders";
        String password = "Anders123";
        UserMapper instance = new UserMapper();
        
        User result = instance.validateUser(username, password);
        assertEquals("Anders", result.getUsername());
        assertEquals("Anders123", result.getPassword());
    }

//    @Test
//    public void testValidateUser2() throws Exception {
//        System.out.println("validateUser");
//        String username = "Kalle";
//        String password = "1234";
//        UserMapper instance = new UserMapper();
//        
//        User result = instance.validateUser(username, password);
//        assertEquals("Kalle", result.getUsername());
//        assertEquals("1234", result.getPassword());
//    }
}