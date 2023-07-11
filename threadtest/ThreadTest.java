package threadtest;


public class ThreadTest extends Thread {

    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
 
    public static void main (String [] args ){
        ThreadTest t=new ThreadTest();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }

    }
}
