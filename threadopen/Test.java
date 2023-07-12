package threadopen;

public class Test {
    public static void main(String[] args) {
        CompteBanquaire cb = new CompteBanquaire();
        CompteBanquaire cb1= new CompteBanquaire();
        Thread t = new Thread(new RunImp(cb, "Cysboy"));
        Thread t2 = new Thread(new RunImp(cb, "Zéro"));
        t.start();
        t2.start();
    }
}
