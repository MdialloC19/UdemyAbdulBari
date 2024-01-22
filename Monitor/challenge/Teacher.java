package Monitor.challenge;

public class Teacher extends Thread {

    String name;
    WhiteBoard wb;
    String text []={"Java is a language", "is OAPS", "It supports Multithreading", "end"};

    public Teacher(String name, WhiteBoard wb){

        this.name=name;
        this.wb=wb;
    }

    public void run(){

        for(int i=0;i<text.length;i++)
            wb.write(text[i]);
       
    }
    
}
