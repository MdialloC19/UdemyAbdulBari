package lambda;


interface MyLambda1{

    public int display(String str1,String str2);
   
}

class useLambda{

    public void callLambda(MyLambda1 ml){
        ml.display(" "," ");
    }
}

class Demo{
    public void method1(){

        useLambda ul=new useLambda();

        // ul.callLambda((s,S1)->{System.out.println(s);});

        // MyLambda1 m1=()->{
        //     int count=0;
        //     System.out.println("Hi");
        //     System.out.println("Bye"+count);
        // };

        // m1.display();

    }
}

// class My implements MyLambda{
//     public void display(){
//         System.out.println("Hello World");
//     }
// }
public class LambdaDemo{

    public LambdaDemo(String s){
        System.out.println(s.toUpperCase());
    }
    public static void reverse(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {

        // MyLambda1 m1=LambdaDemo::new; for cosntructor
        // Demo d=new Demo();
        // d.method1();
    //    MyLambda1 ml=System.out::println;
    MyLambda1 m1=String::compareTo;

       System.out.println(m1.display("Bonjour","Hello"));
    }
    
}
