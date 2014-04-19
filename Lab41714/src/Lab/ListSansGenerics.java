package Lab;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Teraesa
 */
public class ListSansGenerics {
    public static void main(String[] args) {
        
    
    
    List employees = new ArrayList();
    
    Employee one = new Employee("Jones", "Thomas", "222-22-2222");
    Employee two = new Employee("Smith", "Jane", "333-33-3333");
    Employee three = new Employee("Johnson", "Betty", "444-44-4444");
    Employee four = new Employee("Jones", "Thomas", "222-22-2222");

    employees.add(one);
    employees.add(two);
    employees.add(three);
    employees.add(four);
    
    System.out.println("Size of List: " + employees.size());
    
    
    Employee retrievedEmployee = (Employee)employees.get(1);
    System.out.println("Employee variable: " + retrievedEmployee.toString());
    
    System.out.print("Contents of list: \n");
    for(int i = 0; i<employees.size(); i++){
            Employee e = (Employee)employees.get(i);
            System.out.println(e);
        }
    }
}
    
    

