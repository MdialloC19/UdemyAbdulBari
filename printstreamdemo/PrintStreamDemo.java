package printstreamdemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
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
    
        FileInputStream fis=new FileInputStream("./printstreamdemo/test.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));

        Student s=new Student();
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();
    
        System.out.println("rollno: "+s.rollno+ " name: "+ s.name +" dept: "+ s.dept);
    }

    
}
