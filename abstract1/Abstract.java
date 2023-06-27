package abstract1;

abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}

class Rectangle extends Shape{
    double length;
    double breadth;

    public Rectangle(double length,double breadth){

        this.breadth=breadth;
        this.length=length;
    }

    public double perimeter(){
        return (this.breadth+this.length)*2;
    }
    public double area(){
        return this.breadth*this.length;
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double perimeter(){
        return this.radius*Math.PI*2;
    }
    public double area(){
        return Math.pow(this.radius,2)*Math.PI;
    }   
}
public class Abstract {
    public static void main(String[] args) {

        Shape s=new Rectangle(10,5);
        System.out.println("Le perimetre : "+s.perimeter());
        System.out.println("Le aire : "+s.area());
        
        
    }
    
}
