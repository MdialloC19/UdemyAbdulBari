package Monitor.atm;

public class Atm {

    
    synchronized public  static void checkBalance(String name){
        System.out.print(name+" is checking");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(" Balance of "+name);
    }

    synchronized public  static void withdraw(String name, int amount){
        System.out.print(name+" à retirer ");
         try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(amount);
    }

    
}
