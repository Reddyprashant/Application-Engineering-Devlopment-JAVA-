/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Order.Order;
import Utility.Validations;
import java.util.ArrayList;

/**
 *
 * @author prashantreddy
 */
public class Person {
    private String name;
    private String empId;
    private static int count =0;
    private String userName;
    private String password;
    private String role;
    private ArrayList<Order> orderList;

        public Person()
    {
        empId = "Emp"+ ++count;
        orderList = new ArrayList<Order>();
    }
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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
        this.password = Validations.generateHash(password)  ;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
        @Override
    public String toString()
    {
        return this.empId;
    }
}
