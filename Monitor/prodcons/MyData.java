package Monitor.prodcons;

public class MyData {

    int value=0;
    boolean flag=true;

    synchronized public void set(int v){

        while(!flag){
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        this.value=v;
        flag=false;
        notify();
    }

    synchronized public int get(){
        int x=0;
        while(flag){
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        x=this.value;
        flag=true;
        notify();

        return x;
    }

    
}
