package printstreamdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;



public class DataStreamDemo {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos =new FileOutputStream("./printstreamdemo/test.txt");
        DataOutputStream dos=new DataOutputStream(fos);

        FileInputStream fis =new FileInputStream("./printstreamdemo/test.txt");
        DataInputStream dis=new DataInputStream(fis);

        Student st=new Student();
        st.rollno=10;
        st.name="Moussa";
        st.dept="CSE2";

        dos.writeInt(st.rollno);
        dos.writeUTF(st.name);
        dos.writeUTF(st.dept);
        dos.close();
        fos.close();


    }
    
}
