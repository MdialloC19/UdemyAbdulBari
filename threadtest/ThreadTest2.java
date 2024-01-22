package threadtest;

class MyThread1 extends Thread{

    public MyThread1(String name){

        super(name);
    }
    
    public void run(){
        int count =1;
        while(true){
            System.out.println(count++ +" My Thread");
            
        }
    }

}
public class ThreadTest2{
    public static void main(String[] args) throws InterruptedException {

        
        MyThread1 t=new MyThread1("My Thread 1");
        t.setDaemon(true);
        // t.setPriority(Thread.MIN_PRIORITY);
        
        
        // System.out.println("ID "+t.getId());
        // System.out.println("Name "+t.getName());
        // System.out.println("Priority "+t.getPriority());
        t.start();
         int count =1;
        while(true){
            System.out.println(count++ +" Main ");
            Thread.yield();
            
        }

        // long debut=System.currentTimeMillis();
       
        // System.out.println("State "+t.getState());
        // System.out.println("Alive "+t.isAlive());
        // try {
        //     Thread.sleep(100);
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        // Thread mainThread=Thread.currentThread();
        // mainThread.join();

        // long fin=System.currentTimeMillis();
        // System.out.println("Nombre temps écoulé " + (fin-debut));
        
    }
}