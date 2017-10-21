/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Product.ProductCatalog;
import Utility.Validations;

/**
 *
 * @author prashantreddy
 */
public class Supplier {
    private String supplierName;
    private String supplierId;
    private static int count=0;
    private String userName;
    private String password;
 private ProductCatalog productCatalog;
 
        public Supplier()
    {
        supplierId = "Supp"+ ++count;
        productCatalog = new ProductCatalog();
    }
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Validations.generateHash(password);
    }
    
   

    

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
        @Override
    public String toString()
    {
        return this.supplierId;
    }
}
