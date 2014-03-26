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
public class DueDateException extends IllegalArgumentException{
    private static String message = "Due date entered is not valid.  Due date cannot be null,"
            + "and cannot be more than 30 days in the future.";

    public DueDateException() {
        super(message);
    }

    public DueDateException(String s) {
        super(message);
    }

    public DueDateException(String msg, Throwable cause) {
        super(message, cause);
    }

    public DueDateException(Throwable cause) {
        super(cause);
    }

    
    
    
}
