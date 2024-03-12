package recursion;

import java.util.Scanner;

public class RechercheDico {

    int rechercheRec(int tab[], int n,int i){
        if(i<tab.length){
            if(tab[i]!=n){
                i++;
                return rechercheRec(tab, n,i);
            } else
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        RechercheDico r=new RechercheDico();
        int B[]={1,2,3,4,5};

        Scanner sc=new Scanner(System.in);
        // System.out.println("Veuillez saisir le nombre \n");
        // int n =sc.nextInt();
        System.out.println("l'indice est "+ r.rechercheRec(B,4,0));


        
    }
}
