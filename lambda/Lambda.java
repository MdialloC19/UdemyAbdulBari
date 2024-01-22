package lambda;

@FunctionalInterface
interface MyLambda{

    // public void display(String str);
    public int add (int x ,int y);
}

// class My implements MyLambda{
//     public void display(){
//         System.out.println("Hello World");
//     }
// }
public class Lambda {

    public static void main(String[] args) {
        MyLambda m=(a,b)->a+b;
        
        // (a,b)->{
        //     return a+b;
        // };
        // (s)->{
        //         System.out.println(s);
        //   };
        // m.display("Hello World");
        int r =m.add(10, 14);
        System.out.println(r);
    }
    
}
