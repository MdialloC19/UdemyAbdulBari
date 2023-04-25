public class ArrayPractice2 {
    public static void main(String []args){

        //Copying an Array 

        int T[]={8,5,12,34,10,11,2,4,5,9,0};
        int L=T.length;
        int B[]=new  int [L];
        
        System.out.println(B.length);
        for (int i=0;i<L;i++){
            B[i]=T[i];
        }
        for(int x:B){
            System.out.printf("%s ",x);
        }


    }
}
