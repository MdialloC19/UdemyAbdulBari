import java.lang.*;
public class Formatted {
    public static void main (String []args){
        //index, conversion for formatting output
       /* int x=10;
        float y=0.0012f;
        char z='A';
        String str="Java Programming ";
        System.out.printf("%3$s %2$e %1$d \n ",x,y,str);*/
        //flag and width
        int a=10;
        int b=-10;
        System.out.printf("%05d\n ",a);
        System.out.printf("%+5d\n ",b);// the minus is replaced by () when the number is negatif.
    }
    
}
