public class Bitewise {
    public static void main(String [] args){
        int x=10,y=6,z,w;
        int e=0b1010;
        z=e>>>1;
        w=~e;
        //z=x^y;
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        System.out.println(String.format("%s",Integer.toBinaryString(e)));
        System.out.println(String.format("%s",Integer.toBinaryString(w)));
    }
    
}
