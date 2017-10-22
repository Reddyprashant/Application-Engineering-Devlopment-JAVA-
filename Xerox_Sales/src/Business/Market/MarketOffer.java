/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;

import Business.Order.Order;
import Business.Product.Product;

/**
 *
 * @author prashantreddy
 */
public class MarketOffer {
    private Market market;
    private double floorRatio;
    private double ceilRatio;
    private double targetRatio;
    private Product product;
   // private int price;
    private String marketOfferId;
    private static int count=0;
    
    public MarketOffer()
    {
        market= new Market();
        product= new Product();
        marketOfferId="MO"+ ++count;
    }
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
    
    
    //private 

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public double getFloorRatio() {
        return floorRatio;
    }

    public void setFloorRatio(double floorRatio) {
        this.floorRatio = floorRatio;
    }

    public double getCeilRatio() {
        return ceilRatio;
    }

    public void setCeilRatio(double ceilRatio) {
        this.ceilRatio = ceilRatio;
    }

    public double getTargetRatio() {
        return targetRatio;
    }

    public void setTargetRatio(double targetRatio) {
        this.targetRatio = targetRatio;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    @Override
    public String toString()
    {
        return this.marketOfferId;
    }
}
