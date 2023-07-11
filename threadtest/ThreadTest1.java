package threadtest;

class MyThread extends Thread{

    public MyThread(String name){

        super(name);
    }
    
    public void run(){
        int count =1;
        while(true){
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println(e);
            }
        }
    }

}
public class ThreadTest1{
    public static void main(String[] args) {

        MyThread t=new MyThread("My Thread 1");

        t.setPriority(Thread.MIN_PRIORITY);
        

        System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        t.start();
        t.interrupt();
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());

        
    }
}