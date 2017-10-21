/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer;
import Business.Person.Person;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author prashantreddy
 */
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private String orderId;
    private static int count=0;
    private String status;
    private Date orderDate;
    private Date expectedDeliveryDate;
    //private Date issueDate;
    private Person person;
    private Customer customer;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Order()
    {
        orderId = "ord"+ ++count;
        orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public OrderItem addOrderItem()
    {
        OrderItem orderItem= new OrderItem();
        orderItemList.add(orderItem);
        return orderItem;
                
    }
    
}
