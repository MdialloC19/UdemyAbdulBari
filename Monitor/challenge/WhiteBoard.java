package Monitor.challenge;

public class WhiteBoard {

    String text;
    int numbStudent=0;
    int count=0;

    // public WhiteBoard(String str){
    //     this.text=str;
    // }

    synchronized public void write(String msg){
        System.out.println("Teacher is writing "+msg);
        while(count!=0){
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }         
        this.text=msg;
        count=numbStudent;
        notifyAll();
    }

    synchronized public String read(){
        String str;
        while(this.count==0){
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }         
        str=this.text;
        count--;
        if(count==0)
            notify();
        return str;
    }
    public void attendant(){
        numbStudent++;
    }
    
}
