package recursion.tree;
import java.util.*;
public class Pile {

    Stack<Integer> maPile=new Stack<Integer>();

    public static void main(String[] args) {
        
        Stack<Integer> mapile = new Stack<Integer>();
            mapile.push(23);
            mapile.push(16);
            mapile.push(18);
        System.out.println(mapile);
        System.out.println("Sommet: "+mapile.peek());
        System.out.println(mapile);
        System.out.println("Pile Vide "+mapile.empty());
        System.out.println("Sommet : "+mapile.pop());
        System.out.println(mapile);
        
    }
    
}
