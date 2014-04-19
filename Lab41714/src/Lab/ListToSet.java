/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Teraesa
 */
public class ListToSet {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
    
    Employee one = new Employee("Jones", "Thomas", "222-22-2222");
    Employee two = new Employee("Smith", "Jane", "333-33-3333");
    Employee three = new Employee("Johnson", "Betty", "444-44-4444");
    Employee four = new Employee("Jones", "Thomas", "222-22-2222");

    employees.add(one);
    employees.add(two);
    employees.add(three);
    employees.add(four);
    
    Set noDupes = new HashSet(employees);
    employees = new ArrayList(noDupes);
    
    for (Employee e : employees){
        System.out.println(e);
    }
    
    }
}
