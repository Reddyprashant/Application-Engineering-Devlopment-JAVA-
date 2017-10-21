/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author prashantreddy
 */
public class Market {
    private String marketName;
    private String marketId;
    private static int count =0;
    private ArrayList<Person> personList;
    
    public Market()
    {
        this.marketId ="MKT"+ ++count;
        personList = new ArrayList<Person>();
    }
}
