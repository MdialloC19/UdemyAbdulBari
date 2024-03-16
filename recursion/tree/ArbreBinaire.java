package recursion.tree;

public class ArbreBinaire
{
    private Noeud racine;
        private class Noeud
        {
            private int data;
            private Noeud gauche;
            private Noeud droit;

            public Noeud(int data){
                this.data=data;
                gauche=null;
                droit=null;
            }
        }


        public ArbreBinaire(){
            racine=null;
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
        public void prefixe(Noeud racine){
            if (racine==null){
                return;
            }
            System.out.print(racine.data+" ");
            prefixe(racine.gauche);
            prefixe(racine.droit);
        }

        public void postfixe(Noeud racine){
            if (racine==null){
                return;
            }
            postfixe(racine.gauche);
            postfixe(racine.droit);
            System.out.print(racine.data+" ");
        }
        public static void main(String[] args){
            ArbreBinaire ab = new
            ArbreBinaire();
            ab.creerArbreBinaire();
            ab.postfixe(ab.racine);
        }
}