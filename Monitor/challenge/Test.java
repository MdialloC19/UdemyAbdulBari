package Monitor.challenge;

public class Test {
    public static void main(String[] args) {
        


        WhiteBoard wb1=new WhiteBoard();
        Teacher t=new Teacher("Moussa", wb1);
        Student S1=new Student("Anta", wb1);
        Student S2=new Student("Gueye", wb1);
        Student S3=new Student("Ablaye", wb1);
        Student S4=new Student("Kaita", wb1);

        t.start();
        S1.start();
        S2.start();
        S3.start();
        S4.start();

      
    }
    
}
