public class MethodPratice1 {
    static void change (int X [], int index, int value){
        X[index]=value;
    }
    static void change2(int x, int value){
        x=value;
    }

    public static void main(String []args){
        int A[]={2,4,6,8,10};
        change(A,2,15);
        for(int x:A){
            System.out.print(x+" ");
        }
    }
}
