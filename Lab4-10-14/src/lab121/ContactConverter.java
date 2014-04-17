/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab121;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 *
 * @author Teraesa
 */
public class ContactConverter {
    private List<String> rawData;
    final int REC_SIZE = 8;
    private static final boolean REMOVE_DUPES = true;
    
    public Collection<Contact> convertToCollection(boolean dupes, List<String> rawData){
        setRawData(rawData);
        List<Contact> contacts = new ArrayList<Contact>();
        for(int i = 0; i < rawData.size(); i++){
            if((i+1) % REC_SIZE == 0){
                Contact contact = new Contact();
                contact.setFirstName(rawData.get((i+1)-8));
                contact.setLastName(rawData.get((i+1)-7));
                contact.setStreetAddress(rawData.get((i+1)-6));
                contact.setCity(rawData.get((i+1)-5));
                contact.setState(rawData.get((i+1)-4));
                contact.setZip(rawData.get((i+1)-3));
                contact.setPhoneNo(rawData.get((i+1)-2));
                contact.setEmail(rawData.get((i+1)-1));
                
                contacts.add(contact);
            }
        }
        
        
        return removeDuplicates(contacts);
    }
    
    private Collection<Contact> removeDuplicates(Collection<Contact> data){
        Set<Contact> noDupes = new LinkedHashSet<Contact>(data);
        List<Contact> contacts = new ArrayList<Contact>(noDupes);
        
        
        return null;
    }

    public void setRawData(List<String> rawData) {
        if (rawData == null || rawData.size() == 0) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        this.rawData = rawData;
    }
    
    public static void main(String[] args) throws IOException {
        TextFileReader reader = new TextFileReader();
        String path = "src" + File.separatorChar + "Lab1.txt";
        List<String> lines = reader.readAll(path);
        
        ContactConverter converter = new ContactConverter();
        List<Contact> contacts = converter.convertToCollection(REMOVE_DUPES, lines);
        System.out.println(lines);
    }
    
}
