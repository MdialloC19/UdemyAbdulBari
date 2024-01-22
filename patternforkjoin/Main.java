package patternforkjoin;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {

          Path chemin = Paths.get("./");
        String filtre = "*.java";
       //Création de notre tâche principale qui se charge de découper son travail en sous-tâches
        FolderScanner fs = new FolderScanner(chemin, filtre);

        //Nous récupérons le nombre de processeurs disponibles
        int processeurs = Runtime.getRuntime().availableProcessors();
        
        
        //Nous créons notre pool de thread pour nos tâches de fond
        ForkJoinPool pool = new ForkJoinPool(processeurs);
        Long start = System.currentTimeMillis();
        
        //Nous lançons le traitement de notre tâche principale via le pool
        pool.invoke(fs);
        Long end = System.currentTimeMillis();
        System.out.println("Il y a " + fs.getResultat() + " fichier(s) portant l'extension " + filtre);
        System.out.println("Temps de traitement : " + (end - start));
        System.out.println("Le nombre de processeur "+processeurs);
    }
   
    
}
