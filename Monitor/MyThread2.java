package Monitor;

public class MyThread2 extends Thread {

    MyData d;

    public MyThread2(MyData data){
        this.d=data;
    }

    public void run(){

        d.display("Welcome");
    }
    
}
