package recursion;

import java.util.Scanner;

public class RecusiveTab {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        // int taille = scan.nextInt();
        // int[] tableau = new int[taille];

        int B[]={0,6,6,1,2,6,4,6,5};
        int A[][]={{1,2,3,5,5,2,5,4,5},{9,10,11,5,23,2,24}};

        System.out.println(nombreOccurrence(B, 0, 6, 0));
        System.out.println(nombreOccurrenceMat(A, 0,0, 2, 0));

        
        // Appel de la fonction récursive pour saisir les valeurs du tableau
        // saisirValeurs(tableau, 0);
        
        scan.close();
    }
    
    // Fonction récursive pour saisir les valeurs d'un tableau
    public static void saisirValeurs(int[] tableau, int index) {
        // Condition de terminaison : si l'index dépasse la taille du tableau
        Scanner scanner = new Scanner(System.in);
        if (index >= tableau.length) {
            return; // Sortie de la fonction récursive
        }
        
        // Saisie de la valeur du tableau à l'index actuel
        // System.out.print("Entrez la valeur à l'index " + index + " : ");
        // tableau[index] = scanner.nextInt();
        
        // Appel récursif pour traiter la prochaine valeur du tableau
        saisirValeurs(tableau, index + 1);
        
    }

    public static int nombreOccurrence(int [] tab, int index, int nombre, int compteur){
        if (index >= tab.length) {
            return compteur; 
        }

        if(tab[index]==nombre){
            compteur++;
        }
        return nombreOccurrence(tab, index+1, nombre, compteur);
    }

    public static int nombreOccurrenceMat(int Mat[][], int index, int index2, int nombre, int compteur){

        if(index>=Mat.length)
            return compteur;

        if(index2<Mat[index].length){
            if(Mat[index][index2]==nombre){
                compteur++;
            }
            return nombreOccurrenceMat(Mat,index,index2+1,nombre, compteur);
        }else{
            // System.out.print("\n");
            return nombreOccurrenceMat(Mat,index+1,0,nombre, compteur);
        }
       
    }
    
}

