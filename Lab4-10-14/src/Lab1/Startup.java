/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Teraesa
 */
public class Startup {
    public static void main(String[] args) {
     Contact one = new Contact();   
     Contact two = new Contact();
     Contact three = new Contact();
     Contact four = new Contact();
     
     File data = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "Lab1.txt");

  if (data.exists()){
        BufferedReader in = null;
        List<String> fileContents = new ArrayList<String>();
        
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
               fileContents.add(line);
                line = in.readLine();
               for (int i = 0; i < fileContents.size(); i++){
                  
                   if( i == 0){
                       one.setFirstName(fileContents.get(i));     
                   }
                   if( i == 1){
                       one.setLastName(fileContents.get(i));     
                   }
                   if( i == 2){
                       one.setStreetAddress(fileContents.get(i));     
                   }
                   if( i == 3){
                       one.setCity(fileContents.get(i));     
                   }
                   if( i == 4){
                       one.setState(fileContents.get(i));     
                   }
                   if( i == 5){
                       one.setZip(fileContents.get(i));     
                   }
                   if( i == 6){
                       one.setPhoneNo(fileContents.get(i));     
                   }
                   if (i == 7){
                       one.setEmail(fileContents.get(i));     
                   }

                   if( i == 8){
                       two.setFirstName(fileContents.get(i));     
                   }
                   if( i == 9){
                       two.setLastName(fileContents.get(i));     
                   }
                   if( i == 10){
                       two.setStreetAddress(fileContents.get(i));     
                   }
                   if( i == 11){
                       two.setCity(fileContents.get(i));     
                   }
                   if( i == 12){
                       two.setState(fileContents.get(i));     
                   }
                   if( i == 13){
                       two.setZip(fileContents.get(i));     
                   }
                   if( i == 14){
                       two.setPhoneNo(fileContents.get(i));     
                   }
                   if ( i == 15) {
                       two.setEmail(fileContents.get(i));     
                   }

                   if( i == 16){
                       three.setFirstName(fileContents.get(i));     
                   }
                   if( i == 17){
                       three.setLastName(fileContents.get(i));     
                   }
                   if( i == 18){
                       three.setStreetAddress(fileContents.get(i));     
                   }
                   if( i == 19){
                       three.setCity(fileContents.get(i));     
                   }
                   if( i == 20){
                       three.setState(fileContents.get(i));     
                   }
                   if( i == 21){
                       three.setZip(fileContents.get(i));     
                   }
                   if( i == 22){
                       three.setPhoneNo(fileContents.get(i));     
                   }
                   if (i == 23){
                       three.setEmail(fileContents.get(i));     
                   }
              
                   if( i == 24){
                       four.setFirstName(fileContents.get(i));     
                   }
                   if( i == 25){
                       four.setLastName(fileContents.get(i));     
                   }
                   if( i == 26){
                       four.setStreetAddress(fileContents.get(i));     
                   }
                   if( i == 27){
                       four.setCity(fileContents.get(i));     
                   }
                   if( i == 28){
                       four.setState(fileContents.get(i));     
                   }
                   if( i == 29){
                       four.setZip(fileContents.get(i));     
                   }
                   if( i == 30){
                       four.setPhoneNo(fileContents.get(i));     
                   }
                   else{
                       four.setEmail(fileContents.get(i));     
                   }
               }
               
		  
	   }
	 
        } catch(IOException ioe) {
            System.out.println("cannot read file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        List<Contact> contacts = new ArrayList<Contact>();
        
        contacts.add(one);
        contacts.add(two);
        contacts.add(three);
        contacts.add(four);
        
        Set myContacts = new HashSet(contacts);
        contacts = new ArrayList(myContacts);
        
        for(Object obj : contacts) {
            String s = (String)obj;
            System.out.println(s);
        }
        
       
  }
  }
}
