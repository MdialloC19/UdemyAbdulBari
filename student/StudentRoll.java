package student;

import java.util.Date;

class Student {

    private String rollNo;
    static private int count;

    public Student() {

        rollNo=generateRn();



    }
    private String generateRn(){
        Date d=new Date();
        String rn="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;

        return rn;
    }

    public String getRollNo()
    {
        return rollNo;
    }
}

public class StudentRoll {

public static void main(String []args) {

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    
}
    
}
