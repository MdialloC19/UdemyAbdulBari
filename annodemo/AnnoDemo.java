package annodemo;

import java.util.List;

class OldClass{
    public void display(){
        System.out.println("Hello");
    }
    @Deprecated
    public void show (){
        System.out.println("Hi");
    }
}
abstract class Parent{
    abstract public void display();
}

class Child extends Parent{
    
    @Override
    public void display(){

    }
}

class My<T>{
    @SafeVarargs
    private void show(T...arg){
        for(T x:arg){
            System.out.println(x);
        }
    }
}

@FunctionalInterface
interface Mon{
    public void show1();
}
public class AnnoDemo {

    static List l;
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // l.add(10);
        // OldClass oc=new OldClass();
        // oc.show();
    }
    
}
