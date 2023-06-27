import java.lang.*;
import java.util.*;
public class Roots {
    public static void main(String [] args){
        float a,b,c,dt;
        double r1,r2;
        Scanner sc=new Scanner(System.in);
        System.out.println("****In this programm we find the roots of equation of 2nd degre ****\n Give the coeficient of the polynome");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("We have this polynome : T(x)="+a+"x^2+"+b+"+x"+c);
        dt=b*b-4*a*c;
        if(dt>0){
            r1=(-b-Math.sqrt(dt))/2*a;
            r2=(-b+Math.sqrt(dt))/2*a;
            System.out.println("Roots are : r1="+r1+" and r2="+r2);
        }else if (dt==0)
            r1=b*b/2*a;
         else
            System.out.println("there isn't roots");



    }
}
