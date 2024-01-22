package Monitor.atm;

public class Customer extends Thread{

    Atm atm;
    private String name;
    private int amount;

    public Customer(Atm atm,String name, int amount){
        this.name=name;
        this.amount=amount;
        this.atm=atm;
    }
    
    public void useAtm(){
        atm.checkBalance(this.name);
        atm.withdraw(this.name,this.amount);
    }    
    public void run(){
         
       useAtm();
      
    }
    
}
