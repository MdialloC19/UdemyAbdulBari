public class ArrayPractice2 {
    public static void main(String []args){

        //Copying an Array 

        int T[]={8,5,12,34,10,11,2,4,5,9,0};
        int L=T.length;
        int B[]=new  int [L];
        int C[]=new int[L];
        
        System.out.println(B.length);
        for (int i=0;i<L;i++){
            B[i]=T[i];
        }
        for(int x:B){
            System.out.printf("%s ",x);
        }
        //Reversee copying array
        System.out.println(" ");
       
        for(int j=L-1;j>=0;j--){
            C[L-1-j]=T[j];
        }
        for(int x:C){
            System.out.printf("%s ",x);
        }
        //We can have the same result by doing this 
        /*
         for(int i=L-1,j=0;i>=0;i--,j++){
            C[j]=T[i];
         }
         */

        
         //Increasing Size of Array
        System.out.println(" ");
        int A[]={8,5,12,34,10,11,2,4,5,9,0};
        int D[]=new int[2*A.length];
        for (int i=0;i<A.length;i++){
            D[i]=A[i];
        }
        A=D;
        D=null;
        for(int x:A){
            System.out.printf("%s ",x);
        }





    }
}
