import java.util.*;
import java.lang.*;
public class Area1{
    public static void main (String [] args){
        int a,b,c;
        float S;
        double Area;
        Scanner sc=new Scanner(System.in);
        System.out.println("***In this programm we'll calculate the area of triangle*****\n Give the three side of the triangle please");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        S=(a+b+c)/2.f;
        Area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("Area= "+Area);

    }
}
