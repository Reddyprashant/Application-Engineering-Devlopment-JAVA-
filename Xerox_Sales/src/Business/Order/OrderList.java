/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author prashantreddy
 */
public class OrderList {
    private ArrayList<Order> orderList;
    
    public OrderList()
    {
        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
     public Order addOrder() 
    {
        Order order= new Order();
         orderList.add(order);
        return order;
                
    }
}
