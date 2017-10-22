/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;

import Business.Customer;
import Business.Person.Person;
import Business.Product.Product;
import Business.Supplier.Supplier;
import java.util.ArrayList;

/**
 *
 * @author prashantreddy
 */
public class Market {
    private String marketName;
    private String marketId;
    private static int count =0;
    private ArrayList<Customer> customerList;
    
    public Market()
    {
        this.marketId ="MKT"+ ++count;
        customerList = new ArrayList<Customer>();
    }


    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
            

    public String getMarketId() {
        return marketId;
    }



    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Market.count = count;
    }
    
   public Customer addCustomer()
   {
       Customer cus = new Customer();
       customerList.add(cus);
       return  cus;
   }
       public void deleteCustomer(Customer customer)
    {
        customerList.remove(customer);
    }
       @Override
    public String toString()
    {
        return this.marketName;
    }
}
