package nestedcatach;

public class NestedCatch {
    public static void main(String[] args) {
        int A[]={30,20,10,40,0};
        
        try {
            int c=A[0]/A[2];
            System.out.println("Division is "+c);

            try{

                System.out.println(A[4]);
            }catch(ArrayIndexOutOfBoundsException e){
                
            System.out.println("Index is invalid");
            }
        }catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        }
        System.out.println("Bye");
    }
}
