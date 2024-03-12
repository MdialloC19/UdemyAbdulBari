package recursion;

import java.util.Scanner;

/*
 *  Ecrire une fonction récursive de recherche
dichotomique (binaire) d’une valeur VAL supposée unique
dans un tableau d’entiers de taille n trié.
 */


   
public class RechercheBinaire {

    int rechercheDico(int tab[],int element,int start, int end){

        if(start>end)
            return -1;

        int mid= start+(end-start)/2;

        if(tab[mid]==element)
            return mid;
        else if(tab[mid]<element)
            return rechercheDico(tab, element, mid+1, end);
        else
        
            return rechercheDico(tab, element, start, mid-1);
    }

     public static void main(String[] args) {
        RechercheBinaire r=new RechercheBinaire();
        int B[]={1,2,3,4,5, 8,9,10,11,23,24};

        Scanner sc=new Scanner(System.in);
        // System.out.println("Veuillez saisir le nombre \n");
        // int n =sc.nextInt();
        System.out.println("l'indice est "+ r.rechercheDico(B,23,0,B.length-1));


        
    }
   
}
