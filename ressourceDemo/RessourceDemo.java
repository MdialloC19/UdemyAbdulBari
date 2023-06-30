package ressourceDemo;

import java.io.*;
import java.util.*;


public class RessourceDemo {

    
    static void Divide() throws Exception{
        
        try(FileInputStream fi=new FileInputStream("./ressourceDemo/text.txt");Scanner sc=new Scanner(fi);)
        {

            
             int a=sc.nextInt();
             int b=sc.nextInt();
             int c=sc.nextInt();
             int d=sc.nextInt();
             System.out.println(a/c);
        }
        // finally{

        //     fi.close();
        //     sc.close();
        // }

    }

    public static void main(String[] args) throws Exception{
        try{
            Divide();
        }catch(Exception e){
            System.out.println(e);
        }
        // int x =sc.nextInt();
        // System.out.println(x);
    }
 
    
}
