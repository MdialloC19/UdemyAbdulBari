package Fraction;

public class Fraction {
    private int numerateur;
    private int denominateur;

    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public void setDenominateur(int denominateur) {
        if (denominateur == 0) {
            this.denominateur=1;
        }
        this.denominateur = denominateur;
    }

    public void afficher() {
        System.out.println(numerateur + "/" + denominateur);
    }

    public void inverser() {
        if(this.numerateur!=0){
            int temp = this.numerateur;
            this.numerateur =getDenominateur();
           setDenominateur(temp);

        }
    }

    public Fraction somme(Fraction Fraction1) {
        int newNumerateur = this.numerateur * Fraction1.denominateur +
                                Fraction1.numerateur * this.denominateur;
        int newDenominateur = this.denominateur * Fraction1.denominateur;
        return new Fraction(newNumerateur, newDenominateur);
    }

    public Fraction multiplication(Fraction Fraction1) {
        int newNumerateur = this.numerateur * Fraction1.numerateur;
        int newDenominateur = this.denominateur * Fraction1.denominateur;
        return new Fraction(newNumerateur, newDenominateur);
    }

    public Fraction division(Fraction Fraction1) {
        int nouveauNumerateur = this.numerateur * Fraction1.denominateur;
        int nouveauDenominateur = this.denominateur * Fraction1.numerateur;
        return new Fraction(nouveauNumerateur, nouveauDenominateur);
    }

    public Fraction soustraction(Fraction Fraction1) {
        int nouveauNumerateur = this.numerateur * Fraction1.denominateur -
                                Fraction1.numerateur * this.denominateur;
        int nouveauDenominateur = this.denominateur * Fraction1.denominateur;
        return new Fraction(nouveauNumerateur, nouveauDenominateur);
    }
}

