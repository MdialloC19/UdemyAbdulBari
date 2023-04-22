public class ArrayPractice1 {
    public static void main(String []arg){
        System.out.println("We rotate an array!!!");
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int temp=A[0];
        System.out.print(" A[]= ");
        for(int i=0; i<A.length;i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println(" ");

        /*for(int i=0;i<A.length-1;i++){
            A[i]=A[i+1];
            if(i==A.length-2)
                A[i+1]=temp;
           
        }*/
        //this also work
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
            if(i==A.length-1)
                A[i]=temp;
           
        }
        for(int i=0; i<A.length;i++){
            System.out.print(A[i]+ " ");
        }

        System.out.println("Insersion in an array!!!");
        int B[]=new int[12];
  
        for(int i=0; i<A.length;i++){
            B[i]=A[i];
        }
        int n=25;// we want insert this number at the index 2
        for(int i=A.length-1;i<=2;i--){
            B[i+1]=B[i];
        }
        B[2]=n;
        System.out.print(" B[]= ");
        for(int i=0; i<B.length;i++){
            System.out.print(B[i]+ " ");
        }
        System.out.println(" ");

    }
    
}
