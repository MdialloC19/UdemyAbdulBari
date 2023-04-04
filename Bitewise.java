import java.util.*;
import java.lang.*;
public class Bitewise {
    public static void main(String [] args){
        int x=10,y=6,z,w;
        int e=0b1010;
        z=e>>>1;
        w=~e;
        //z=x^y;
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        System.out.println(String.format("%32s",Integer.toBinaryString(e)));
        System.out.println(String.format("%s",Integer.toBinaryString(w)));
        System.out.println(w);
        //Swapping using bitewise xor
        int a =10, b=15;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+" b= "+b);
        //Masking and Mergin
        byte c=9, d=12, f=0;
        f=(byte)(c<<4);
        f=(byte)(f|d);
        System.out.println((f&0b11110000)>>4);
        System.out.println((f&0b0001111));
       // System.out.println(String.format("%8s",Integer.toBinaryString(f)));


    }
    
}
