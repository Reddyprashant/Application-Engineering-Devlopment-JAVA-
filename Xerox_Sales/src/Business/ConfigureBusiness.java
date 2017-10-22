/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Market.Market;
import Business.Market.MarketList;
import Business.Market.MarketOffer;
import Business.Market.MarketOfferCatalog;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Person.EmployeeDirectory;
import Business.Person.Person;
import Business.Product.Product;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.CatchNode;

/**
 *
 * @author prashantreddy
 */
public class ConfigureBusiness {

    public static Business Initialize() {
        Business business = new Business();
        try{
        SupplierDirectory sd = business.getSupplierDirectory();

        Supplier s = sd.addSupplier();
        s.setSupplierName("Dell");
        s.setUserName("s123");
        s.setPassword("s123");
        

        Product p= s.getProductCatalog().addProduct();
        p.setProductName("Laptop");
        p.setPrice(1000);
        p.setAvailability(77);
        
         Product p1= s.getProductCatalog().addProduct();
        p1.setProductName("Printer");
        p1.setPrice(800);
        p1.setAvailability(90);
        
        Product p2= s.getProductCatalog().addProduct();
        p2.setProductName("desktop");
        p2.setPrice(600);
        p2.setAvailability(11);
        
        Supplier s1 = sd.addSupplier();
        s1.setSupplierName("HP");
        s1.setUserName("h123");
        s1.setPassword("h123");
        
        Product p3= s1.getProductCatalog().addProduct();        
        p3.setProductName("Printer");
        p3.setPrice(1000);
        p3.setAvailability(65);
        
        Product p4= s1.getProductCatalog().addProduct();        
        p4.setProductName("Laptop");
        p4.setPrice(1200);
        p4.setAvailability(100);

        Supplier s3 = sd.addSupplier();
        s3.setSupplierName("Apple");
        s3.setUserName("a123");
        s3.setPassword("a123");
        
                Product p5= s3.getProductCatalog().addProduct();        
        p5.setProductName("Laptop");
        p5.setPrice(2000);
        p5.setAvailability(20);
        
         Product p6= s3.getProductCatalog().addProduct();        
        p6.setProductName("Iphone");
        p6.setPrice(1000);
        p6.setAvailability(88);
        
        
        EmployeeDirectory ed = business.getEmployeeDirectory();

        Person person = ed.addPerson();
        person.setName("Virat");
        person.setRole("Admin");
        person.setUserName("admin");
        person.setPassword("a123");

        Person person1 = ed.addPerson();
        person1.setName("ABD");
        person1.setRole("Sales person");
        person1.setPassword("s123");
        person1.setUserName("sales");

        MarketList ml = business.getMarketList();
        Market market = ml.addMarket();
        market.setMarketName("Education");

        Customer customer = new Customer();
        customer.setName("NEU");
        customer.setMarketName(market.getMarketName());
        customer.setAddress("boston");

        Customer customer1 = new Customer();
        customer1.setName("MIT");
        customer1.setMarketName(market.getMarketName());
        customer1.setAddress("boston");
        ArrayList<Customer> c = new ArrayList<>();
        c.add(customer);
        c.add(customer1);
        market.setCustomerList(c);

        Market market1 = ml.addMarket();
        market1.setMarketName("Financial");

        Customer customer2 = new Customer();

        customer2.setName("BOA");
        customer2.setMarketName(market1.getMarketName());
        customer2.setAddress("boston");

        Customer customer3 = new Customer();
        customer3.setName("RBI");
        customer3.setMarketName(market1.getMarketName());
        customer3.setAddress("london");
        ArrayList<Customer> c1 = new ArrayList<>();
        c1.add(customer2);
        c1.add(customer3);
        market1.setCustomerList(c1);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(p);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        MarketOffer marketOffers = new MarketOffer();
        MarketOffer marketOffer1 = new MarketOffer();
        
        MarketOfferCatalog marketOfferCatalog = business.getMarketOfferCatalog();
        //Market market= business.getMarketList().getMarketList();
        for (Market market2 : business.getMarketList().getMarketList()) {
            for (Product product : products) {
                 if(market2.getMarketName().equals("Education"))
                 {
                     
                     marketOffers = marketOfferCatalog.addMarketOffer();
                     marketOffers.setMarket(market);
        marketOffers.setProduct(product);
        marketOffers.setTargetRatio(0.9);
        marketOffers.setFloorRatio(0.8);
        marketOffers.setCeilRatio(1.2);
                 }
                 else if(market2.getMarketName().equals("Financial")){
          marketOffer1= marketOfferCatalog.addMarketOffer();
        marketOffer1.setMarket(market1);
        marketOffer1.setProduct(product);
        marketOffer1.setTargetRatio(1.3);
        marketOffer1.setFloorRatio(1.1);
        marketOffer1.setCeilRatio(1.5);
                }
//                 else if(market.getMarketName().equals("Sports")){
//           MarketOffer marketOffers= marketOfferCatalog.addMarketOffer();
//        marketOffers.setMarket(market);
//        marketOffers.setProduct(product);
//        marketOffers.setTargetRatio(1.1);
//        marketOffers.setFloorRatio(0.9);
//        marketOffers.setCeilRatio(1.5);
//                }
            }
            
        }
        
        OrderItem orderItem = new OrderItem();
        orderItem.setMarketOffer(marketOffers);
        orderItem.setQuantity(3);
        orderItem.setPaidPrice(600);
                
        
        OrderItem orderItems = new OrderItem();
        orderItems.setMarketOffer(marketOffer1);
        orderItems.setQuantity(1);
        orderItems.setPaidPrice(500);
        
         OrderItem orderItem1 = new OrderItem();
        orderItem1.setMarketOffer(marketOffer1);
        orderItem1.setQuantity(2);
        orderItem1.setPaidPrice(900);
        
//        ArrayList<OrderItem> orderItemList= new ArrayList<OrderItem>();
//        orderItemList.add(orderItem);
        
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        
        Order order = business.getOrderList().addOrder();
        order.setCustomer(customer);
        order.setExpectedDeliveryDate(date.parse("10/29/2017"));
        order.setOrderDate(date.parse("10/25/2017"));
        order.setStatus("in Transit");
        order.getOrderItemList().add(orderItem);
        order.setPerson(person1);
        person1.getOrderList().add(order);
        
        Order order1 = business.getOrderList().addOrder();
        order1.setCustomer(customer1);
        order1.setExpectedDeliveryDate(date.parse("10/28/2017"));
        order1.setOrderDate(date.parse("10/26/2017"));
        order1.setStatus("in Transit");
        order1.getOrderItemList().add(orderItems);
        order1.setPerson(person1);
        person1.getOrderList().add(order1);
        
        Order order2 = business.getOrderList().addOrder();
        order2.setCustomer(customer2);
        order2.setExpectedDeliveryDate(date.parse("10/30/2017"));
        order2.setOrderDate(date.parse("10/26/2017"));
        order2.setStatus("in Transit");
        order2.getOrderItemList().add(orderItem1);
        order2.setPerson(person1);
        person1.getOrderList().add(order2);
        }
        catch(ParseException p)
        {
            JOptionPane.showMessageDialog(null, "Please Enter date in MM/dd/yyyy format");
        }
        return business;
    }
    

}


