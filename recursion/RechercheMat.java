package recursion;

import java.util.Scanner;

/*
 * Ecrire une fonction récursive d’affichage des
valeurs d’une matrice de dimensions nl (nombre de lignes)
et nc ( nombre de colonnes ).
 */
public class RechercheMat {

    void afficherMat(int Mat[][], int i, int j){

        if(i<Mat.length){
            if(j<Mat[i].length){
                System.out.print(Mat[i][j]+"\t");
                afficherMat(Mat, i, j+1);
            }else{

                System.out.print("\n");
                afficherMat(Mat, i+1,0);
            }
        }


    }

    public static void main(String[] args) {
        RechercheMat r=new RechercheMat();
        int B[][]={{1,2,3,4,5},{9,10,11,23,24}};

        Scanner sc=new Scanner(System.in);
        // System.out.println("Veuillez saisir le nombre \n");
        // int n =sc.nextInt();
        r.afficherMat(B, 0, 0);


        
    }
    
}
