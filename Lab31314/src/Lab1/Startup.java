/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;

import java.util.Date;

/**
 *
 * @author Teraesa
 */
public class Startup {
    public static void main(String[]args){
        Invoice i = new Invoice();
        System.out.println("Invoice Date: " + i.getInvoiceDate() + "\n\n");
        System.out.println("Invoice Due Date: " + i.retrieveDueDate() + "\n\n");
        System.out.println("Invoice Due Date as String: " + i.getDueDateAsString());
        
    }
    
}
