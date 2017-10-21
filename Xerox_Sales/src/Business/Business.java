/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Market.MarketList;
import Business.Market.MarketOffer;
import Business.Person.EmployeeDirectory;
import Business.Supplier.SupplierDirectory;

/**
 *
 * @author prashantreddy
 */
public class Business {
    private SupplierDirectory supplierDirectory;
    private MarketList marketList;
    private MarketOffer marketOffer;
    private EmployeeDirectory employeeDirectory;
    

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

    public MarketOffer getMarketOffer() {
        return marketOffer;
    }

    public void setMarketOffer(MarketOffer marketOffer) {
        this.marketOffer = marketOffer;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
}
