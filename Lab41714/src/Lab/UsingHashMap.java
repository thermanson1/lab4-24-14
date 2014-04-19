/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author Teraesa
 */
public class UsingHashMap {
    public static void main(String[] args) {
        Employee one = new Employee("Jones", "Thomas", "222-22-2222");
        Employee two = new Employee("Smith", "Jane", "333-33-3333");
        Employee three = new Employee("Johnson", "Betty", "444-44-4444");
        Employee four = new Employee("Jones", "Thomas", "222-22-2222");
        
        
        Map map = new HashMap();
        map.put("222-22-2222", one);
        map.put("333-33-3333", two);
        map.put("444-44-4444", three);
        map.put("222-22-2222", four);
        
        System.out.println("Retrieve second object: ");
        System.out.println(map.get("333-33-3333"));
        
        System.out.println("\nLooping through the keys: ");
        Set keys = map.keySet();
        for(Object key : keys) {
            Employee found = (Employee)map.get(key);
            System.out.println(found.toString());
        }
        
        
        System.out.println("\nLooping through the values: ");
        Collection values = map.values();
        for(Object emp : values) {
            System.out.println((Employee)emp);
        }
        
    }
}
