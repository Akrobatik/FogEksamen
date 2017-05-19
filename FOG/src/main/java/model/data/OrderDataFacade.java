/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import model.data.interfaces.IOrderDataFacade;
import exceptions.ToLogException;
import java.util.List;
import model.entity.Order;
import model.entity.User;

/**
 *
 * @author Anders
 */
public class OrderDataFacade implements IOrderDataFacade {
    
    OrderMapper om = new OrderMapper();
    
    @Override
    public void addOrder(String roofType, double width, double length, double height, int idUser) throws ToLogException {
        om.addOrder(roofType, width, length, height, idUser);
    }

    @Override
    public void deleteOrder(int idOrder) throws ToLogException {
        om.deleteOrder(idOrder);
    }

    @Override
    public List<Order> getOrders() throws ToLogException {
        return om.getOrders();
    }

    @Override
    public List<Order> getUserOrder(User user) throws ToLogException {
        return om.getUserOrder(user);
    }
    
    
}
