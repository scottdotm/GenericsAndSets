package LAb;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Scott
 */
public class Challenge2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "Mickey", "111-11-1111");
        Employee e2 = new Employee("Marks", "Matt", "222-22-2222");
        Employee e3 = new Employee("Johnson", "Scott", "333-33-3333");
        
        
        List<Employee> employee = new ArrayList<Employee>();
        
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        
        for(Employee em : employee){
            System.out.println("\n First Name : " + em.getFirstName() + "\n Last Name :  " + em.getLastName() + "\n SSN : " + em.getSsn());
        }
        
    }
}
