class Circle{
    public double radius;

    public double are()
    {
        return radius*radius*Math.PI;
    }

    public double perimeter()
    {
        
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
public class Circle1{
    public static void main(String args[]){

        Circle c1=new Circle();
        Circle c2=new Circle();
        c1.radius=7;
        c2.radius=5;

        System.out.println("Area :"+c1.are());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());

        System.out.println("Area"+c2.are());
        System.out.println(c2.perimeter());
        System.out.println(c2.circumference());


    }
    
}