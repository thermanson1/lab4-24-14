/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab121;

import java.util.Collection;

/**
 *
 * @author Teraesa
 */
public class Startup {
    public static void main(String[] args) {
        FileService service = new FileService();
        Collection<Contact> contacts = service.readFile("src/Lab1.txt");
    }
}
