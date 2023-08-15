package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable {
    int rollno;
    String name;
    String dept;
    float avg;

    public static int Data=10;
    public transient int t;
    public Student (){

    }
    public Student( int r, String n, float a, String  d){
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }

    public String toString(){
        return "The rollno : "+rollno+
                " The name : "+name+
                " avg: " +avg+
                " dept: "+ dept+
                " Data: "+ Data+
                " t: "+ t;
    }

}

public class MyWrite {
    public static void main(String[] args) throws Exception {
        FileOutputStream fo=new FileOutputStream("./serialization/mytest.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fo);

        Student st=new Student(200, "Moussa", 20,"Gestion");
        oos.writeObject(st);

        FileInputStream fi=new FileInputStream("./serialization/mytest.txt");
        ObjectInputStream ois=new ObjectInputStream(fi);
        Student st1=null;
        st1=(Student)ois.readObject();
        System.out.println(st1.toString());

       


    }
}
