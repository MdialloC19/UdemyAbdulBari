
// this is possible because B is sub class of A
class A{
    public A display(){
        System.out.println("Super display");
        return new A();
    }
}

class B extends A{
    @java.lang.Override
    public B display(){
        System.out.println("Super display");
        return new B();
    }
}


class Super1
{
    private void display()//or even protected may not give any error.
    {
        System.out.println("Super display.");
        
    }
}

class Sub1 extends Super    
{
    //@Override if public
    public void display()
    {
        System.out.println("Sub diaplay.");
        
    }
}

public class OverrideRules {

    public static void main(String[] args) {
        
        Sub s=new Sub();
        
    }
    
}