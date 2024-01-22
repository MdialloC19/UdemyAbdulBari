package Monitor;

public class MyThread1 extends Thread {

    MyData d;

    public MyThread1(MyData data){
        this.d=data;
    }

    public void run(){
        
        d.display("Hello World");
    }
    
}
