package randomacessdemo;

import java.io.RandomAccessFile;

public class RandomAcessDemo {

    public static void main(String[] args) throws Exception{
        RandomAccessFile rf=new RandomAccessFile("./randomacessdemo/test.txt", "rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        // rf.write('i');
        System.out.println((char)rf.read());
        rf.seek(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
    }
    
}
