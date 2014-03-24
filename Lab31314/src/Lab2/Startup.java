/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab2;

/**
 *
 * @author Teraesa
 */
public class Startup {
    
    public static void main(String[]args){

        DateService ds = new DateService();
    
        System.out.println("ToDateObject date: \t" + ds.toDateObject("3/15/2014"));
    }
}
