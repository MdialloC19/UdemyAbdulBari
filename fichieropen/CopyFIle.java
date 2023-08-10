package fichieropen;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CopyFIle {

public static void main(String[] args) {
    
    FileInputStream fis=null;
    FileOutputStream fos=null;

    try {
        File f=new File("/home/mdialloc19/Documents/DIC1/Java/UdemyAbdulBari/fichieropen/text.txt");

        System.out.println("Le chemin du fichier :"+f.getAbsolutePath());
        System.out.println("Le chemin du fichier :"+f.getAbsoluteFile());
        System.out.println("Nom du fichier : "+f.getName());

        fis = new FileInputStream(f);
        fos =new FileOutputStream(new File("./fichieropen/text2.txt"));

        byte []buf=new byte[8];

        int n=0;

        while((n=fis.read(buf))>=0){

            fos.write(buf);

            for (byte bit : buf) {
                System.out.print("\t" + bit + "(" + (char) bit + ")");
                System.out.println("");
            }
            //Nous allons réinitialiser le buffeur
            buf = new byte[8];
        }
        System.out.println("Copie terminée !");

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }finally{

        try {
            if(fis!=null)
                fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }
         try {
            if(fos!=null)
                fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
    
}
