/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Teraesa
 */
public class Invoice {
    private Calendar invoiceDate;
    private int gracePeriod = 15;
    private Calendar dueDate;
    
    public Invoice(){
        invoiceDate = Calendar.getInstance();
        invoiceDate.set(2014, Calendar.MARCH, 22);

    }
   
    
    public Date retrieveDueDate(){
    
    invoiceDate.add(Calendar.DATE, gracePeriod);
        Date dueDate = new Date();
        dueDate = invoiceDate.getTime();
        return dueDate;
    }


    public String getDueDateAsString(){
        Date date = new Date();
        String format = "MM/dd/yyyy hh:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        dueDate = Calendar.getInstance();
        date = dueDate.getTime();
        String formattedDate = sdf.format(date);
        sdf = new SimpleDateFormat("M/d/yyyy h:mm a");
        formattedDate = sdf.format(date);
        return formattedDate;
    }
    
     public Calendar getInvoiceDate(){
        return invoiceDate;
    }
    //invoice date cannot be null, invoice date cannot be in the future
    public void setInvoiceDate(Calendar invoiceDate) throws InvoiceDateException{
        if (invoiceDate == null){
            throw new InvoiceDateException();
        }
       
        Calendar afterDate = Calendar.getInstance();
        afterDate.add(Calendar.DATE, 1);
        if (invoiceDate.after(afterDate)){
            throw new InvoiceDateException();
        }
        this.invoiceDate = invoiceDate;
        
    }

    public int getGracePeriod() {
        return gracePeriod;
    }
    //grace period cannot be anything other than 15
    public void setGracePeriod(int gracePeriod) throws IllegalArgumentException{
        if (gracePeriod != 15){
            throw new IllegalArgumentException("Grace period must be 15 days");
        }
        this.gracePeriod = gracePeriod;
    }
    public Calendar getDueDate(){
        return dueDate;
    }
    //due date cannot be null, cannot be more than 30 days in the future
    public void setDueDate(Calendar dueDate) throws DueDateException{
        if (dueDate == null){
            throw new DueDateException();
        }
        
        Calendar afterDate = Calendar.getInstance();
        afterDate.add(Calendar.DATE, 30);
        if (dueDate.after(afterDate)){
            throw new DueDateException();
        }
        this.dueDate = dueDate;
    }
    
}
