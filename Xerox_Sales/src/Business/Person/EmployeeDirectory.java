/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Supplier.Supplier;
import Utility.Validations;
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
    
    public Person isValidUser(String userName, String password)
    {
        String pass=Validations.generateHash(password);
         //UserAccount userAccount = new UserAccount();
         for (Person person : personList) {
             
             if(person.getUserName().equalsIgnoreCase(userName)&&person.getPassword().equals(pass))
             {
                    

                 return person;
             
             }
        }
         return null;
    }
}
