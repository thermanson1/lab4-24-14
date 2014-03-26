/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;

/**
 *
 * @author Teraesa
 */
public class InvoiceDateException extends IllegalArgumentException{
    private static String message = "The invoice date you have entered is invalid.  Date"
            + "cannot be null, and cannot be a future date.";

    public InvoiceDateException() {
        super(message);
    }

    public InvoiceDateException(String s) {
        super(message);
    }

    public InvoiceDateException(String msg, Throwable cause) {
        super(message, cause);
    }

    public InvoiceDateException(Throwable cause) {
        super(cause);
    }
    
}
