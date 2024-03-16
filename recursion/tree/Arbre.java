package recursion.tree;

public class Arbre {
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

    public Arbre() {
        racine = null;
    }
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
    }

    // Autres méthodes pour la création et les parcours de l'arbre...

    // Fonction récursive pour compter le nombre de nœuds ayant exactement deux fils
    public int compterNoeudsAvecDeuxFils() {
        return compterNoeudsAvecDeuxFils(racine);
    }

    private int compterNoeudsAvecDeuxFils(Noeud racine) {
        if (racine == null) {
            return 0;
        }

        int avecDeuxFils = 0;

        // Vérifier si le nœud actuel a exactement deux fils
        if (racine.gauche != null && racine.droit != null) {
            avecDeuxFils = 1;
        }

        // Compter récursivement les nœuds ayant exactement deux fils dans les sous-arbres gauche et droit
        return avecDeuxFils + compterNoeudsAvecDeuxFils(racine.gauche) + compterNoeudsAvecDeuxFils(racine.droit);
    }

    public static void main(String[] args) {
        Arbre ab = new Arbre();
        ab.creerArbreBinaire(); // Assurez-vous de créer votre arbre binaire avant d'appeler compterNoeudsAvecDeuxFils()

        // Exemple : comptage des nœuds ayant exactement deux fils
        int noeudsAvecDeuxFils = ab.compterNoeudsAvecDeuxFils();
        System.out.println("Le nombre de nœuds avec exactement deux fils est : " + noeudsAvecDeuxFils);
    }
}
