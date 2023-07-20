package Monitor.prodcons;

public class Producer extends Thread{

    MyData d;

    

    public Producer(MyData dat){
        this.d=dat;
    }

    public void run(){

        int i=0;
        while(true){
            d.set(i);
            System.out.println("Producer make "+i);
            // try {
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            //     // TODO: handle exception
            // }
            i++;
        }
    }
    
}
