package LAb;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Scott
 */

public class Challenge3 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Marks", "Matt", "111-11-1111");
        Employee e2 = new Employee("Jones", "John", "222-22-2222");
        Employee e3 = new Employee("Peterson", "Amy", "333-33-3333");
        
        Dog d1 = new Dog("Bell", 3333);
        Dog d2 = new Dog("Midnight", 4444);
        
        List listOfThings = new ArrayList();
        
        listOfThings.add(e1);
        listOfThings.add(e2);
        listOfThings.add(e3);
        listOfThings.add(d1);
        listOfThings.add(d2);
        
        
//        for (Object listOfThing : listOfThings) {
//            System.out.println(listOfThing.toString());
//        }
        
        for (Object listOfThing : listOfThings) {
            if (listOfThing.getClass() == common.Dog.class) {
                Dog d = (Dog) listOfThing;
                System.out.println("Rabies ID: " + d.getRabiesId() + ", Name: " + d.getName() );
                
            } else if (listOfThing.getClass() == common.Employee.class) {
                Employee e = (Employee) listOfThing;
                System.out.println("Name: " + e.getLastName() + ", " + e.getFirstName() + ", SSN: " + e.getSsn());
                
            } else {
                System.out.println(listOfThing.toString());
            }
        }
        
    }
    
}