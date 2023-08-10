package fichieropen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestFIlter {

    public static void main(String[] args) {
        
        FileInputStream fis=null;
        FileOutputStream fos=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;

        try {
            fis=new FileInputStream(new File("./fichieropen/text.txt"));
            fos=new FileOutputStream(new File("./fichieropen/text2.txt"));
            bis=new BufferedInputStream(new FileInputStream(new File("./fichieropen/text.txt")));
            bos=new BufferedOutputStream(new FileOutputStream(new File("./fichieropen/text2.txt")));

            byte[] buf = new byte[8];
       
        long startTime = System.currentTimeMillis();
        while(fis.read(buf) != -1){

            fos.write(buf);
            buf=new byte[8];
        }
        System.out.println("Copie términée pour Input/Output Stream:" +(System.currentTimeMillis() - startTime));

        long startTime1 = System.currentTimeMillis();
        while(bis.read(buf) != -1){

            bos.write(buf);
            buf=new byte[8];

        }
        System.out.println("Copie términée pour buffered Input/Output Stream:" +(System.currentTimeMillis() - startTime1));   
        fis.close();
        bis.close();
        fos.close();
        bos.close();
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{

        try {
            if(fis!=null)
                fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }
         try {
            if(fos!=null)
                fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            if(bis!=null)
                bis.close();
        }catch(IOException e){
            e.printStackTrace();
        }
         try {
            if(bos!=null)
                bos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    }
    
}
