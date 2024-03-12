package recursion;

import java.util.Scanner;

public class RecurisionCroissante {

    void afficherTerm(int n){
        if(n>0){
            System.out.println(n+"\n");
            afficherTerm(n-1);
        }
    }

    void afficherNoTerm(int n,int i){
        if(i<n){
          
        }
    }

    public static void main(String[] args) {

        RecurisionCroissante r=new RecurisionCroissante();
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre \n");
        int n =sc.nextInt();
        r.afficherTerm(n);

        
        
    }
    
}
