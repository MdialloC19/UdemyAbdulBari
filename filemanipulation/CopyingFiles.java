package filemanipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFiles {

    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream(new File("./filemanipulation/source.txt"));
            fos=new FileOutputStream(new File("./filemanipulation/source1.txt"));
            int b;
            byte []buf=new byte[8];
            while((b=fis.read())!=-1){
                if(b>=65&& b<=120)
                    fos.write((b+32));
                else
                    fos.write((b));
            }
            // fos.write(buf);

            // System.out.println(str);
            

        } catch (FileNotFoundException e) {
             e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                if(fis!=null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(fos!=null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
