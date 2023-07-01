package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {

    public static void main(String[] args) {
        List l=new LinkedList();

        l.add(10);
        l.add("Voir");
        l.add(14.5f);

        for(int i = 0; i < l.size(); i++){
            System.out.println("Élément à l'index " + i + " = " +l.get(i));
        }

        System.out.println("\n \tParcours avec un itérateur ");
        System.out.println("-----------------------------------");

        ListIterator li = l.listIterator();

        while(li.hasNext())
            System.out.println(li.next());

        ArrayList al = new ArrayList();
        al.add(12);
        al.add("Une chaîne de caractères !");
        al.add(12.20f);
        al.add('d');

        for(int i = 0; i < al.size(); i++){
            System.out.println("Élément à l'index " + i + " = " +al.get(i));
        }

        Hashtable ht = new Hashtable();
        ht.put(1, "printemps");
        ht.put(10, "été");
        ht.put(12, "automne");
        ht.put(45, "hiver");

        Enumeration e=ht.elements();
        // System.out.println(e);

        while(e.hasMoreElements())
            System.out.println(e.nextElement());


        HashSet hs = new HashSet();
        hs.add("toto");
        hs.add(12);
        hs.add('d');
        
        Iterator it = hs.iterator();
        while(it.hasNext())
        System.out.println(it.next());
        System.out.println("\nParcours avec un tableau d'objet");
        System.out.println("-----------------------------------");
        Object[] obj = hs.toArray();

        for(Object o : obj)
            System.out.println(o);
    }
    
}
