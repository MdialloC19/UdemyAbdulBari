package Monitor.atm;

public class Main {
    public static void main(String[] args) {
        Atm atm= new Atm();
        Customer cm1=new Customer(atm, "Moussa",25000);
        Customer cm2=new Customer(atm, "Ablaye",20000);
        cm2.start();
        cm1.start();
        
    }

}
