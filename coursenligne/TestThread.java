package coursenligne;

public class TestThread {

    public static void main(String[] args) {
        Runnable task=()->System.out.println(Thread.currentThread().getName());

        task.run();
        Thread t=new Thread(task);
        Thread t1=new Thread(task);
        t.start();
        boolean b=t.isDaemon();
        System.out.println(b);
    }
    
}
