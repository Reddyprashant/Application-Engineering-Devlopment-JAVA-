/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

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
   
  private SupplierDirectory()
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
}