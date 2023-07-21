package Monitor.challenge;

public class Student extends Thread {


    String name;
    WhiteBoard wb;
    public Student(String name, WhiteBoard wb){
        this.name=name;
        this.wb=wb;
        wb.attendant();
    }
    
    
    public void run(){

        String text;
        
        do{

            text=wb.read();
            System.out.println(this.name+" read "+ text);
            System.out.flush();
        }while(!text.equals("end"));

    }
    
}
