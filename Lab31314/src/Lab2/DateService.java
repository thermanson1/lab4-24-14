/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab2;


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
        date = date.trim();
        Date d = new Date();
        Calendar calendar = Calendar.getInstance();
        String format = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String formattedDate = sdf.format(date);
       
        String sDate = formattedDate;
        try {d = sdf.parse(sDate);
        
        } catch (ParseException p) {
            System.out.println("Could not parse date");
        }
        return d;
    }
    public Calendar toCalendarObject(String date){
        date = date.trim();
        Date d = new Date();
        String format = "MM/dd/yyyy hh:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String formattedDate = sdf.format(date);
        String sDate = formattedDate;
        try { d = sdf.parse(sDate);
        } catch (ParseException p){
            System.out.println("Couldn't parse the date");
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        
        
        
        return cal;
    }
}
