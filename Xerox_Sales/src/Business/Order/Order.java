/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer;
import Business.Person.Person;
import Business.Product.Product;
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
    private double commission;

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

        public Order()
    {
        orderId = "ord"+ ++count;
        orderItemList = new ArrayList<OrderItem>();
        person = new Person();
        customer= new Customer();
    }
    
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
        this.status = statusreturn();
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
        //orderItem.getMarketOffer().setProduct(product);
        orderItemList.add(orderItem);
        return orderItem;
                
    }
    public void removeOrderItem(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }
    
   public OrderItem searchOrderItem(int orderItemName) {
        for(OrderItem orderItem : orderItemList) {
            if(orderItem.getMarketOffer().getProduct().getProductName().equals(orderItemName)) {
                return orderItem;
            }
        }
        return null;
    }
    
   public double orderTotal(){
        double totalPriceOrder = 0;
        for(OrderItem orderItem:orderItemList){
            
        totalPriceOrder = totalPriceOrder + orderItem.orderItemTotal();
        }
        return totalPriceOrder;
    }
   
   public double orderTotalTargetPrice()
   {
       double totalTargetPrice =0;
       for (OrderItem orderItem : orderItemList) {
          totalTargetPrice=+orderItem.targetPrice();
       }
       return totalTargetPrice;
   }
    public String statusreturn()
    {
        if(orderDate.equals(new Date()))
        {
            return("Processing");
        }
        else if(expectedDeliveryDate.after(orderDate))
        {
            return("Shipping");
        }
        else if(expectedDeliveryDate.before(new Date()))
        {
            return("Delivered");
        }
        return null;
                
    }
           
    
    @Override
    public String toString()
    {
        return this.orderId;
    }
}
