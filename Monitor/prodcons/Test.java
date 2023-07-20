package Monitor.prodcons;

public class Test {

    public static void main(String[] args) {

        MyData d=new MyData();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);

        p.start();
        c.start();
    }
    
}
