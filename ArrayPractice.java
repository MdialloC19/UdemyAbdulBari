import java.util.*;

public class ArrayPractice {
    public static void main(String [] args){
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int Sum=0,find=0;
        Scanner src=new Scanner(System.in);
        System.out.println("Finding Sum of all elements!!!");
        for(int i=0; i<A.length;i++){
            Sum+=A[i];
        }
        System.out.println(" Sum = "+Sum);

        System.out.println("Searching an element!!! \nVoici les élements du tableau");
        System.out.print(" A[]= ");
        for(int i=0; i<A.length;i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println(" Veuillez saisr l'éléments à rechercher");
        int elt=src.nextInt();
        for(int i=0; i<A.length;i++){
            if(elt==A[i]){
                find=i;
            }

        }
        if(find!=0)
            System.out.println("L'élément se trouve à l'index: "+find);
        else
            System.out.println("L'élément se trouve pas dans le tableau");
            
        
        
        
    }
}
