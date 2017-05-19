/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.interfaces.IOrderDomainFacade;
import exceptions.ToLogException;
import java.util.List;
import model.data.OrderDataFacade;
import model.entity.Order;
import model.entity.User;

/**
 *
 * @author Anders
 */
public class OrderDomainFacade implements IOrderDomainFacade{
    
    OrderDataFacade odf = new OrderDataFacade();
                
    @Override
    public void addOrder(String roofType, double width, double length, double height, int idUser) throws ToLogException {
        odf.addOrder(roofType, width, length, height, idUser);
    }

    @Override
    public void deleteOrder(int idOrder) throws ToLogException {
        odf.deleteOrder(idOrder);
    }

    @Override
    public List<Order> getOrders() throws ToLogException {
        return odf.getOrders();
    }

    @Override
    public List<Order> getUserOrder(User user) throws ToLogException {
        return odf.getUserOrder(user);
    }
    
}
