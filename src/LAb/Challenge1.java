package LAb;


import java.util.ArrayList;
import java.util.List;

/**
 * Hobby chosen was Video Games, was unsure if we were making a list of one of our hobbies
 * or if we were doing a list of hobbies, however I just believe we were practicing lists 
 * so I just chose one hobby and based my list off of Video Games.  This class uses lists
 * without the use of generics.  Along with add and remove functionality.
 * @author Scott
 */

public class Challenge1 {
    public static void main(String[] args) {
        
        List games = new ArrayList();
        
        games.add("Hearthstone");
        games.add("Battlefield");
        games.add("Battlefront");
        
        for (Object hobbie : games) {
            String h = hobbie.toString();
            System.out.println(h);
        }
        
        games.add("Diablo3");
        games.add("Warhammer");
        games.add("Fallout4");
        
        System.out.println("\n");
        
        for (Object hobbie : games) {
            String h = hobbie.toString();
            System.out.println(h);
        }
        
        games.remove("Fallout4");
        games.remove("Warhammer");
        
        System.out.println("\n");
        
        for (Object hobbie : games) {
            String h = hobbie.toString();
            System.out.println(h);
            
        }
    }
}