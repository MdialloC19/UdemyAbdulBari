package fichieropen;
import java.io.File;

public class Fichier {

    public static void main(String[] args) {
        
        File f=new File("text.txt");

        System.out.println("Le chemin du fichier :"+f.getAbsolutePath());
        System.out.println("Le chemin du fichier :"+f.getAbsoluteFile());
        System.out.println("Nom du fichier : "+f.getName());
        System.out.println("Est-ce qu'il existe ? " + f.exists());
        System.out.println("Est-ce un répertoire ? " + f.isDirectory());
        System.out.println("Est-ce un fichier ? " + f.isFile());
        
        System.out.println("Affichage des lecteurs à la racine du PC :");

        for(File file:f.listRoots()){
            System.out.println(file.getAbsolutePath());

            try{
                int i=0;
                for(File nom:file.listFiles()){
                    System.out.print("\t\t"+ ((nom.isDirectory()) ? nom.getName()+"/":nom.getName()));

                    if(i%4==0){
                        System.out.println();
                    }
                }
                i++;
            }catch(NullPointerException e){
                e.printStackTrace();
            }
        }
    }
    
}
