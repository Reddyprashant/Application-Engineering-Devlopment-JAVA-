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
    private int paidPrice;

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

    public int getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(int paidPrice) {
        this.paidPrice = paidPrice;
    }
    
    public OrderItem()
    {
        marketOffer= new MarketOffer();
                
    }
}
