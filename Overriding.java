class Super {
    public void display(){
        System.out.println("Super Class Display");
    }
    
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub Classs Display Hello Welcome ");
    }
   
}

class TV{
    public void swithOn(){
        System.out.println("TV is Switched ON");
    }
    public void changeChannel(){
            System.out.println("Tv Channel is changed");

    }
}

class SmartTV extends TV{
    @Override
    public void swithOn(){
        System.out.println("SmartTV is Switched ON");
    }
    @Override
    public void changeChannel(){
            System.out.println("SmartTv Channel is changed");
    }

    public void browse(){
        System.out.println("SmartTV Browsing");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Super sup=new Sub();
        sup.display();

        // Sub sb=new Sub();
        // sb.display();
        TV t=new SmartTV();
        t.swithOn();
        t.changeChannel();
        //t.browse();
    }
    
}
