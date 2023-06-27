
class Parent{

    Parent() {
        System.out.println("Non-Param of Parent");
    }
    Parent(int x) {
        System.out.println("Param of Parent");
    }
}

class Child extends Parent {
   Child(){

        System.out.println("Non-Param Child");
        
    }
   Child(int y){

        System.out.println("Param of Child ");
        
    }
    Child(int x,int y){

        super(x);
        System.out.println("2 Param of Child "+y);
        
        
    }
}
class Rectangle
{
    double length;
    double breadth;

    Rectangle(){
        length=1;
        breadth=1;
    }
    
    Rectangle(double l, double b){
        setLength(l);
        setBreadth(b);
    }

    Rectangle(double s){
        length=breadth=s;
    }
    public double getLength()
    {
        return length;
    }
    
    public double getBreadth()
    {
        return breadth;
    }
    
    public void setLength(double l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
    }
    
    public void setBreadth(double b)
    {
        if(b>=0)
            breadth=b;
        else 
            breadth=0;
    }
    
    public double area()
    {
        //return length*breadth;
        return getLength()*getBreadth();
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else 
            return false;
    }
}

class Cuboid extends Rectangle
{
   double height;

    Cuboid(){
        height=1;
    }
    Cuboid(int h){
        this.height=h;
    }
    
    Cuboid(double l, double b,double h){
        super(l,b);
        height=h;
        
    }
    double volume(){
        return length*height*breadth;
    }
}         

class GrandChild extends Child {
   GrandChild(){

        System.out.println("GrandChild Constructor");
        
    }
}

public class InheritConst {

   public static void main(String[] args) {

    Cuboid c=new Cuboid(5,3,10);
    System.out.println(c.volume());
        
    }
    
}
