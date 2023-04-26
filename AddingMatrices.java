public class AddingMatrices {
    public static void main(String []args){
        int B[][]={{1,2,3},{2,4,6},{1,3,5}};
        int A[][]={{1,4,4},{2,3,4},{4,3,4}};
        int C[][]=new int[B.length][B.length];
        int D[][]=new int[B.length][B.length];
        //Adding 2 Matrices
        System.out.println("Adding 2 Matrices");
        for(int i=0;i<B.length;i++){

            for(int j=0;j<B[i].length;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }

         for(int x[]:C){
            for(int y:x){
                System.out.printf(y+" ");
            }
            System.out.println("");
        }
        // Multiplying 2 Matrices
        System.out.println("Multiplying 2 Matrices");
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[i].length;j++){
                D[i][j]=0;
                for(int k=0;k<B.length;k++)
                    D[i][j]=D[i][j]+A[i][k]*B[k][j];
            }
        }

         for(int x[]:D){
            for(int y:x){
                System.out.printf(y+" ");
            }
            System.out.println("");
        }

    }
}
