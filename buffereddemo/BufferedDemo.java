package buffereddemo;
import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws Exception{
        FileReader fis=new FileReader("./buffereddemo/Test.txt");
        BufferedReader bis=new BufferedReader(fis);

        System.out.println("File "+fis.markSupported());
        System.out.println("Buffer "+bis.markSupported());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(4);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());

        System.out.println("String "+ bis.readLine());

    }
    
}
