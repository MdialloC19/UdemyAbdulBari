package threadopen;

public class RunImp implements Runnable {
    private CompteBanquaire cb;
    private String name;

    public RunImp(CompteBanquaire cb, String name){
        this.cb = cb;
        this.name = name;
    }
           
    public void run(){
        for(int i = 0; i < 25; i++){
                if(cb.getSolde() > 0){
                cb.retraitArgent(2);
                System.out.println("Retrait effectué par "+this.name);
            }
        }
    }
}
