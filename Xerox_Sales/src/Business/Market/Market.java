/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;

import Business.Customer;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author prashantreddy
 */
public class Market {
    private String marketName;
    private String marketId;

    public String getMarketId() {
        return marketId;
    }
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
            @Override
    public String toString()
    {
        return this.marketName;
    }
}
