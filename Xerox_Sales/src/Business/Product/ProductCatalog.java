/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Supplier.Supplier;
import java.util.ArrayList;

/**
 *
 * @author prashantreddy
 */
public class ProductCatalog {
    private ArrayList<Product> productList;


    
    public ProductCatalog()
    {
        productList = new ArrayList<Product>();
    }
    
    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    public Product addProduct()
    {
        Product product = new Product();
        productList.add(product);
        return product;
    }
    
    public void deleteProduct(Product product)
    {
        productList.remove(product);
    }
    public Product searchProduct(String id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Product p : productList) {
            if(p.getProductId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
