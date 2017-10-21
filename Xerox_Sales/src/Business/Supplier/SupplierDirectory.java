/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Person.Person;
import Utility.Validations;
import java.util.ArrayList;

/**
 *
 * @author prashantreddy
 */
public class SupplierDirectory {
   private ArrayList<Supplier> supplierList;

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
   
  public SupplierDirectory()
  {
      supplierList = new ArrayList<Supplier>();
  }
  public Supplier addSupplier()
    {
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
    }
    
    public void deleteSupplier(Supplier supplier)
    {
        supplierList.remove(supplier);
    }
        public Supplier searchSupplier(String keyWord) {
        for(Supplier s : supplierList) {
            if(keyWord.equals(s.getSupplierId())) {
                return s;
            }
        }
        return null;
    }
        
        public Supplier isValidUser(String userName, String password)
    {
        String pass=Validations.generateHash(password);
         //UserAccount userAccount = new UserAccount();
         for (Supplier supplier : supplierList) {
             
             if(supplier.getUserName().equalsIgnoreCase(userName)&&supplier.getPassword().equals(pass))
             {
                    

                 return supplier;
             
             }
        }
         return null;
    }
}
