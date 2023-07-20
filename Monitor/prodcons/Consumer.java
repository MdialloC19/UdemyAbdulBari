package Monitor.prodcons;

public class Consumer extends Thread{

    MyData d;

    public Consumer(MyData dat){
        this.d=dat;
    }

    public void run(){

        while(true){
            // try {
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            //     // TODO: handle exception
            // }
            
            System.out.println("Consumer "+d.get());
           
        }
    }
    
}
