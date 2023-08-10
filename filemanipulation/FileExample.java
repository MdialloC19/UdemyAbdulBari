package filemanipulation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("./filemanipulation/Test.txt");
            String str="Learning Java Programming";
            fos.write(str.getBytes());
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
