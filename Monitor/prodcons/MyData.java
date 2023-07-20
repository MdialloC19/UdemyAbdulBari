package Monitor.prodcons;

public class MyData {

    int value=0;

    synchronized public void set(int v){

        this.value=v;
    }

    synchronized public int get(){
        return this.value;
    }

    
}
