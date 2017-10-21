/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Market.MarketList;
import Business.Market.MarketOffer;
import Business.Market.MarketOfferCatalog;
import Business.Order.OrderList;
import Business.Person.EmployeeDirectory;
import Business.Supplier.SupplierDirectory;

/**
 *
 * @author prashantreddy
 */
public class Business {
    private SupplierDirectory supplierDirectory;
    private MarketList marketList;
    private MarketOfferCatalog marketOfferCatalog;
    private EmployeeDirectory employeeDirectory;
    private OrderList orderList;

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }
    

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MarketList getMarketList() {
        return marketList;
    }

    public void setMarketList(MarketList marketList) {
        this.marketList = marketList;
    }

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
}
