/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Anders
 */
public class Customer {
    private String firstname;
    private String lastname;
    private int id;
    
    public Customer() {
    }
    
    public Customer(String fn, String ln, int i) {
        firstname = fn;
        lastname = ln;
        id = i;
    }
    
    public String getFirstName() {
        return firstname;
    }
    
    public void setFirstName(String fn) {
        firstname = fn;
    }
    
    public String getLastName() {
        return lastname;
    }
    
    public void setLastName(String ln) {
        lastname = ln;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int i) {
        id = i;
    }
    
    @Override
    public String toString () {
        return "Customer{" + "Firstname: " + firstname + "\nLastname: " + lastname + "\nID: " + id + '}';
    }
}
