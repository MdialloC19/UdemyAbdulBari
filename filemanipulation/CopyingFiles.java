package filemanipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyingFiles {

    public static void main(String[] args) {
        FileInputStream fis2=null;
        FileInputStream fis1=null;
        FileOutputStream fos=null;
        SequenceInputStream sis=null;
        try {
            fis1=new FileInputStream(new File("./filemanipulation/source.txt"));
            fis2=new FileInputStream(new File("./filemanipulation/source1.txt"));
            fos=new FileOutputStream(new File("./filemanipulation/Destination.txt"));

            sis=new SequenceInputStream(fis1, fis2);

            int b;
            while((b=sis.read())!=-1){
                fos.write(b);
            }

            /*Second Method for reading two different fill and put their content on another file
            byte []buf=new byte[fis1.available()];
            byte []buf2=new byte[fis2.available()];
            fis1.read(buf);
            fis2.read(buf2);
            fos.write(buf);
            fos.write(buf2);
             */
            // while((b=fis1.read())!=-1){
            //     if(b>=65&& b<=120)
            //         fos.write((b+32));
            //     else
            //         fos.write((b));
            // }
            // fos.write(buf);

            // System.out.println(str);
            

        } catch (FileNotFoundException e) {
             e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                if(fis1!=null)
                    fis1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis2!=null)
                    fis2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(sis!=null)
                    sis.close();
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
