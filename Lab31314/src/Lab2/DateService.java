/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Teraesa
 */
public class DateService {
    
    public Date toDateObject(String date){
        if (date == null || date.length() <= 7 || date.length() >= 11){
            throw new IllegalArgumentException("Date must be at least 8 characters and no more "
                    + "than 10 characters.");
            
        }
        Date d = new Date();
        Calendar calendar = Calendar.getInstance();
        String format = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf = new SimpleDateFormat("M/d/yyyy");
        String formattedDate = sdf.format(date);
        
        String sDate = formattedDate;
        try {
        d = sdf.parse(sDate);
        } catch(ParseException pe) {
            System.out.println("Could not parse date string -- illegal format");
        }
        return d;
    }
    public Calendar toCalendarObject(String date){
        if (date == null || date.length() <= 17 || date.length() >= 19){
            throw new IllegalArgumentException("Date must be 18 characters");
            
        }
        Calendar calendar = Calendar.getInstance();
        Date d = new Date();
        String format = "MM/dd/yyyy hh:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String formattedDate = sdf.format(date);
        
        String strDate = date;
        date = null;
        DateFormat df = DateFormat.getInstance();
        try {
                
                d = df.parse(strDate);
        } catch (ParseException pe) {
                System.out.println("Couldn't parse the date. Reason: " + pe);
                System.out.println("\nA typical date format would look like this:");
                System.out.println(new Date());
        }
        calendar.set(Calendar.DATE, Calendar.(DateService.d));
    }
}
