
class Super2{
    protected void display(){
        System.out.println("Super Display");
    }
}

class Sub2 extends Super2{
    public void display(){
        System.out.println("Sub display");

}


    }
public class Override1 {
    public static void main(String[] args) {

        Test t=new Test();
        t.max(10,5);
        t.max(10,15, 5);
        
    }
}
