package throwthrowsdemo;

import java.lang.*;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimension of dimension should be negative";
    }
}
public class ThrowThrowsDemo {

    static int area(int l, int b)throws NegativeDimensionException
    {
        if(l<0||b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1()throws NegativeDimensionException
    {
        
        System.out.println(area(-10, 5));
    }

    // static void meth2(){
    //     meth1();
    // }

    // static void meth3(){
    //     meth2();
    // }

    public static void main(String[] args)
    {
        try {
            
            meth1();
        } catch (NegativeDimensionException e) {
           System.out.println(e);
        }
    }
    
}
