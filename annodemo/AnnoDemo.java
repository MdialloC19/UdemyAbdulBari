package annodemo;

import java.util.List;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;



@interface MyAnno{
    // Méta data
    String name() ;
    String project();
    String date() default "new date()";
    String version() default "13";
    
}
@MyAnno(name = "Musa",project="Bank", date="1/2/2020", version = "13" )
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
