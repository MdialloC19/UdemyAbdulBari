package langdemo;

import java.lang.*;

class MyObject {
    public String toString(){
        return "My Object";
    }

    public int hashCode(){
        return 108;
    }

    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
    
}

public class LangDemo {
    public static void main(String[] args) {
        MyObject o1= new MyObject();
        MyObject o2=new MyObject();
        
        System.out.println(o1.equals(o2));
    }
    
}
