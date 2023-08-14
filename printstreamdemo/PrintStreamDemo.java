package printstreamdemo;

import java.io.FileOutputStream;
import java.io.PrintStream;

class Student{
    int rollno;
    String name;
    String dept;
}


public class PrintStreamDemo {

    public static void main(String[] args)throws Exception {
        FileOutputStream fos =new FileOutputStream("./printstreamdemo/test.txt");
        PrintStream ps=new PrintStream(fos);

        Student st=new Student();
        st.rollno=10;
        st.name="John";
        st.dept="CSE";

        ps.println(st.rollno);
        ps.println(st.name);
        ps.println(st.dept);

        ps.close();
        fos.close();
    }

    
}
