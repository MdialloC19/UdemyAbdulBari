package open;

public class Lion extends Felin{

    public Lion(){

    }
    public Lion (String couleur, int poids){
        this.couleur=couleur;
        this.poids=poids;
    }
    void crier (){
        System.out.println("Je grogne très fort");
    }
    
}
