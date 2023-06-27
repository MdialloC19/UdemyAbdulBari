package throwthrowsdemo;

public class ThrowThrowsDemo {

    static int meth1(){
        return 10/0;
    }

    static void meth2(){
        meth1();
    }

    static void meth3(){
        meth2();
    }

    public static void main(String[] args) {
        meth3();
    }
    
}
