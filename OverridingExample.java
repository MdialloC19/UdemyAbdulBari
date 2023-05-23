
class Car{
    public void start(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Car is accelerateed");
    }
    public void changeGear(){
        System.out.println("Car change Gear");
    }
}

class LuxuryCar extends Car{
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void openRoof(){
        System.out.println("Sun Roof is Opened");
    }
}

public class OverridingExample {
        public static void main(String[] args) {

            LuxuryCar c=new LuxuryCar();
            
            c.start();
            c.accelerate();
            c.changeGear();
            c.openRoof();

            
        }
}
