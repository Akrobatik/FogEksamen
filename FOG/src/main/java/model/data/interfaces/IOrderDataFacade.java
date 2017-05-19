/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data.interfaces;

import exceptions.ToLogException;
import java.util.List;
import model.entity.Order;
import model.entity.User;

/**
 *
 * @author Anders
 */
public interface IOrderDataFacade {
    void addOrder(String roofType, double width, double length, double height, int idUser) throws ToLogException;
    
    public void deleteOrder(int idOrder) throws ToLogException;
    
    public List<Order> getOrders() throws ToLogException;
    
    public List<Order> getUserOrder(User user) throws ToLogException;
}
