package Monitor;

public class Test {
    public static void main(String[] args) {
        MyData d=new MyData();
        
        MyThread1 t1=new MyThread1(d);

        MyThread2 t2=new MyThread2(d);

        t2.start();
        t1.start();

    }
    
}
