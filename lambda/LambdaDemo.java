package lambda;


interface MyLambda1{

    public void display();
   
}

class useLambda{

    public void callLambda(MyLambda1 ml){
        ml.display();
    }
}

class Demo{
    public void method1(){

        useLambda ul=new useLambda();

        ul.callLambda(()->{System.out.println("Hello World");});

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

    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
    
}
