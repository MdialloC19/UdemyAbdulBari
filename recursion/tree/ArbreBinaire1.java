package recursion.tree;

public class ArbreBinaire1 {
    private Noeud racine;

    private class Noeud {
        private int data;
        private Noeud gauche;
        private Noeud droit;

        public Noeud(int data) {
            this.data = data;
            gauche = null;
            droit = null;
        }
    }

    public ArbreBinaire1() {
        racine = null;
    }

    // Autres méthodes pour la création et les parcours de l'arbre...
    public void creerArbreBinaire(){
        Noeud un = new Noeud(1);
        Noeud deux = new Noeud(2);
        Noeud trois = new Noeud(3);
        Noeud rep1 = new Noeud(6);
        Noeud quatre = new Noeud(4);
        Noeud rep2 = new Noeud(6);
        Noeud rep3 = new Noeud(6);
        Noeud rep4 = new Noeud(6);
        
        Noeud cinq = new Noeud(5);
        racine=un;
        un.gauche=deux;
        un.droit=trois;
        deux.gauche=rep1;
        deux.droit=cinq;
        rep1.gauche=quatre;
        rep1.droit=rep2;
        cinq.gauche=rep3;
        cinq.droit=rep3;
    }
    // Fonction récursive pour compter le nombre de fois qu'une valeur apparaît dans l'arbre
    public int compterOccurrences(int valeur) {
        return compterOccurrencesRecursive(racine, valeur);
    }

    public int compterOccurrencesRecursive(Noeud racine, int valeur) {
        if (racine == null) {
            return 0;
        }

        int occurrences = 0;
        if (racine.data == valeur) {
            occurrences++;
        }

        occurrences += compterOccurrencesRecursive(racine.gauche, valeur);
        occurrences += compterOccurrencesRecursive(racine.droit, valeur);

        return occurrences;
    }

    public static void main(String[] args) {
        ArbreBinaire1 ab = new ArbreBinaire1();
        ab.creerArbreBinaire();
        
        // Exemple de comptage d'occurrences pour la valeur 6
        int occurrences6 = ab.compterOccurrences(6);
        System.out.println("Le nombre d'occurrences de la valeur 6 dans l'arbre est : " + occurrences6);
    }
}
