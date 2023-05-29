package localinner;

abstract class My{
    abstract public void show ();
}

class Outer{
    public void display(){
        
            new My() {
                public void show () {
                    System.out.println(" Hello");
                }
            }.show();
    }
}

public class LocalInner {
    public static void main(String[] args) {

        Outer O=new Outer();
        O.display();
        
    }
    
}
