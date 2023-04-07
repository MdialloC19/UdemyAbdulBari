import java.lang.*;
public class Formatted {
    public static void main (String []args){
        int x=10;
        float y=0.0012f;
        char z='A';
        String str="Java Programming ";
        System.out.printf("%3$s %2$e %1$d \n ",x,y,str);
    }
    
}
