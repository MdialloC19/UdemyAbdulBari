public class MethodPratice {
    static void inc (int x){
        x++;
        System.out.println(x);
    }
     int  max(int x,int y){
        if(x>y)
            return x;
        return y;
    }
    public static void main(String args[]){
        int a=10, b=5, c=0;

        MethodPratice mp=new MethodPratice();

       // c=max(a,b);
        System.out.println(mp.max(a, b));
        inc(a);
        System.out.println(a);
        
    }
}
    