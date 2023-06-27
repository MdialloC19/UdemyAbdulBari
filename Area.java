import java.lang.*;
import java.util.*;
public class Area {
    public static void main (String [] args){
        float b,h,Area;
        Scanner sc=new Scanner(System.in);
        System.out.println("***In this programm we'll calculate the area of triangle*****\n Give the base of the triangle please");
        b=sc.nextFloat();
        System.out.println("Give the height of tgle");
        h=sc.nextFloat();
        Area=b*h/2;
        System.out.println("Area="+Area);
    }
}
