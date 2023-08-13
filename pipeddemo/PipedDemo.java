package pipeddemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
    OutputStream os;

    public Producer(OutputStream os){
        this.os=os;
    }
    public void run(){
        int count=1;
        while(true){
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer "+count);
                Thread.sleep(10);
                count++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread{
    InputStream is;

    public Consumer(InputStream i){
        this.is=i;
    }
    public void run(){

        int x;
        
        while(true){
            try {
                x=is.read();
                System.out.println("Consumer "+x);
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class PipedDemo {
    public static void main(String[] args) throws Exception{

        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();

        pos.connect(pis);

        Producer p=new Producer(pos);
        Consumer c=new Consumer(pis);

        p.start();
        c.start();
        
    }
    
}
