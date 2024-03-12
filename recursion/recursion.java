package recursion;

import java.util.Scanner;

public class recursion {

    void afficherTerm(int n,int i){

        if(i<=n){
            System.out.println(i +" ");
            afficherTerm(n, i+1);   
        }
    }

    void afficherNoTerm(int n){

        if(n>0){
            afficherNoTerm(n-1);   
            System.out.println(n+" ");
        }
    }


    public static void main(String[] args) {
        recursion r=new recursion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre \n");
        int n =sc.nextInt();
        r.afficherNoTerm(n);
    }
    
}
