package recursion.tree;

import java.util.LinkedList;
import java.util.Queue;

public class File {
    public static void main(String[] args)
        {
            Queue<Integer> queue = new LinkedList<Integer>();
            System.out.println("La file est vide: "+queue.isEmpty());
                queue.offer(12);
                queue.offer(45);
                queue.offer(56);
                queue.add(24);// same thing offer
            System.out.println(queue);
                queue.offer(18);
            System.out.println(queue);
            Integer x = queue.poll();
            System.out.println("tête de file: "+x);
            System.out.println("la nouvelle tête "+queue.peek());
            // System.out.println("la nouvelle tête "+queue.);

        }
}
