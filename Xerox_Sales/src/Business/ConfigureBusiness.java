/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.EmployeeDirectory;
import Business.Person.Person;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;

/**
 *
 * @author prashantreddy
 */
public class ConfigureBusiness {
    public static Business Initialize(String name)
    {
        Business business = new Business();
        SupplierDirectory  sd= business.getSupplierDirectory();
               
        
                 Supplier s = sd.addSupplier(); 
       s.setSupplierName("Dell");
        s.setUserName("s123");
        s.setPassword("s123");
        

        EmployeeDirectory ed=business.getEmployeeDirectory();
        
         Person person = ed.addPerson("head");
        
        if(person!= null)
        {
        
        UserAccount ua= uad.addUser();
        ua.setPerson(person);
        ua.setAccountStatus("Active");
        ua.setPassword("h123");
        ua.setRole("HR");
        ua.setUserName("headHR");
        }
        
                Person person1 = pd.findByLastName("admin");
        
        if(person1!= null)
        {
        
        UserAccount ua= uad.addUser();
        ua.setPerson(person1);
        ua.setAccountStatus("Active");
        ua.setPassword("s123");
        ua.setRole("Admin");
        ua.setUserName("sAdmin");
        }
                  
       
       return business; 
    }
}
