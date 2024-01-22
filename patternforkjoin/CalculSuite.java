package patternforkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class CalculSuite extends RecursiveTask<Long> {
    private long debut = 0, fin = 0, resultat;
    private int SEUIL = 1_000;

    public CalculSuite(long debut, long fin) {
        this.debut = debut;
        this.fin = fin;
    }

    protected Long compute() {
        long nombreDeChoseAFaire = fin - debut;
        if (nombreDeChoseAFaire < SEUIL) {
            System.out.println("Passage en mode MonoThread ou le découpage calcul le résultat");
            resultat = calculer();
        } else {
            System.out.println("Passage en mode Fork/Join");
            // On découpe la tâche en deux
            long milieu = nombreDeChoseAFaire / 2;
            CalculSuite calcul1 = new CalculSuite(debut, (debut + milieu) - 1);
            calcul1.fork();
            CalculSuite calcul2 = new CalculSuite(debut + milieu, fin);
            resultat = calcul2.compute() + calcul1.join();
        }
        return resultat;
    }

    public long calculer() {
        for (long i = debut; i <= fin; i++) {
            System.out.println(resultat + " + " + i);
            resultat += i;
        }
        return resultat;
    }

    public long getResultat() {
        return resultat;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        CalculSuite calcul = new CalculSuite(0, 100_000);
        pool.invoke(calcul);
        System.out.println("Résultat du calcul : " + calcul.getResultat());
    }
}
