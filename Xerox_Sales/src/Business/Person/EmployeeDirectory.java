/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Supplier.Supplier;
import java.util.ArrayList;

/**
 *
 * @author prashantreddy
 */
public class EmployeeDirectory {
    private ArrayList<Person> personList;


    
    public EmployeeDirectory()
    {
        personList = new ArrayList<Person>();
    }
    
        public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    public Person addPerson()
    {
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public void deletePerson(Person person)
    {
        personList.remove(person);
    }
    
    public Person isValid(String userId,String pwd){
         
         for(Person person:personList)
         {
             
             if(person.getUserName().equals(userId)&&person.getPassword().equals(pwd))
             {
                
                return person;
                 
             }
                
         }
        return null;     
     }
}
