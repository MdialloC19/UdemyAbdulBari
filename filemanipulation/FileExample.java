package filemanipulation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        FileInputStream fos=null;
        try {
            fos=new FileInputStream("./filemanipulation/Test.txt");
            // reading it globaly
            byte []b=new byte[fos.available()];

            fos.read(b);
            String str=new String(b);
            System.out.println(str);
            // Second method read it byte by byte
            /*byte [] buf =new byte[8];

            while(fos.read(buf)!=-1){
                for (byte bit : buf) {
                    System.out.print((char)bit);
                }
                buf =new byte[8];
            }*/
            System.out.println("\n");
        } catch (FileNotFoundException e) {  
                e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
