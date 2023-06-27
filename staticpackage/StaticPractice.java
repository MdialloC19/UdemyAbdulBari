package staticpackage;


class Test{
    static int price=10;
    int x=20;

    void show(){
        System.out.println(price+" "+x);
    }
    static void display(){
        System.out.println(price);
    }
}

public class StaticPractice{
    public static void main(String []args ){

        Test t1=new Test();
        t1.show();

        t1.price=15;
        t1.x=10;

        Test t2=new Test();
        t2.show();
        
        
    }
}