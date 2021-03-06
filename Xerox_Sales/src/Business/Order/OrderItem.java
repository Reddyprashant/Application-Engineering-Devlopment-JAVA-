/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Market.MarketOffer;

/**
 *
 * @author prashantreddy
 */
public class OrderItem {
    private MarketOffer marketOffer;
    private int quantity;
    private double paidPrice;
    

    public OrderItem()
    {
        marketOffer= new MarketOffer();
                
    }
    
    public MarketOffer getMarketOffer() {
        return marketOffer;
    }

    public void setMarketOffer(MarketOffer marketOffer) {
        this.marketOffer = marketOffer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(double paidPrice) {
        this.paidPrice = paidPrice;
    }
    
    public  double orderItemTotal()
    {
        double totalPrice = getQuantity()*getPaidPrice();
        return totalPrice;
    }
    public  double targetPrice()
    {
        double totalTargetPrcie = getQuantity()*getMarketOffer().getTargetRatio()*getMarketOffer().getProduct().getPrice();
        return totalTargetPrcie;
        
    }
    @Override
    public String toString()
    {
        return marketOffer.getProduct().getProductName();
    }
}
