package localinner;

// abstract class My{
//     abstract public void show ();
// }

class Outer{

    int x=10;
    static int y=20;
    static class My{
        public void show() {

            // Outer i=new Outer();
            // System.out.print(i.x);

            System.out.println(y);
            
        }
    }

    // public void display(){
        
    //         new My() {
    //             public void show () {
    //                 System.out.println(" Hello");
    //             }
    //         }.show();
    // }
}

public class LocalInner {
    public static void main(String[] args) {

        Outer.My O=new Outer.My();
        O.show();
        
    }
    
}
