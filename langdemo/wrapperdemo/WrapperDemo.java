package langdemo.wrapperdemo;

public class WrapperDemo {

    public static void main(String[] args) {
        // int i=10;
        Integer i=new Integer(10);

        Integer a=Integer.valueOf(10);
        Integer b=10;

        Byte c=15;
        Byte d=Byte.valueOf("15");
        Byte bb=15;
        Byte e=Byte.valueOf(bb);

        Short f=Short.valueOf("123");

        Float g=12.5f;
        

        Double j=Double.valueOf(123.458);

        Character k=Character.valueOf('A');

        Boolean bol=Boolean.valueOf("true");

        Float h=Float.valueOf("125.5");
        float x=h.floatValue(); // unboxing
        float y=h; // autounboxing

        int m=10;
        Integer n=Integer.valueOf(m); //boxing
        Integer o=m;// autounboxing
    }
    
}
