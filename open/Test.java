package open;

public class Test {
    public static void main(String[] args) {

        Loup l = new Loup("Gris bleuté", 20);
        l.boire();
        l.manger();
        l.deplacement();
        l.crier();
        System.out.println(l.toString());
        
    }
    
}
