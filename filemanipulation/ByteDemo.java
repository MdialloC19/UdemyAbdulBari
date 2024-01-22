package filemanipulation;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteDemo {

    public static void main(String[] args) throws Exception{
        byte []b ={'a','v','c','d','e','f','g','h','i','j'};

        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte b1[]=bos.toByteArray();

        bos.writeTo(new FileOutputStream("./filemanipulation/voir"));
        // for(byte x:b1){
        //     System.out.println((char)x);
        // }
        // ByteArrayInputStream bis=new ByteArrayInputStream(b);

        // String str=new String(bis.readAllBytes());
        // System.out.println(bis.markSupported());

        // int x;
        // while((x=bis.read())!=-1){

        //     System.out.print(" "+(char)x);

        // }
        // bis.close();
    }
    
}
