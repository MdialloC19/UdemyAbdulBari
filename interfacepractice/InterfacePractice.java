package interfacepractice;

interface Test
{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    private void meth3(){
        System.out.println("Meth3 of Test");
       
    }
    default void meth5()
    {
        meth3();
    }
}

interface Test2 extends Test
{
    void meth4();
}

class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class InterfacePractice 
{
    public static void main(String[] args) 
    {
        System.out.println(Test.X);
        // Test.meth3();
        My M=new My();
        M.meth5();
        
    }
}