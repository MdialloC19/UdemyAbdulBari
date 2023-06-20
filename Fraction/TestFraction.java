package Fraction;

public class TestFraction {
    public static void main(String[] args) {
    // Création de fractions
    Fraction fraction1 = new Fraction(5, 2);
    Fraction fraction2 = new Fraction(3, 4);

    // Affichage des fractions
    fraction1.afficher();  
        fraction2.afficher();  

    // Inversion de fraction1
    fraction1.inverser();
    fraction1.afficher();  

    // Somme de fraction1 et fraction2
    Fraction somme = fraction1.somme(fraction2);
    somme.afficher();  


    // Multiplication de fraction1 et fraction2
    Fraction multiplication = fraction1.multiplication(fraction2);
    multiplication.afficher();  

    // Division de fraction1 par fraction2
    Fraction division = fraction1.division(fraction2);
    division.afficher();  

    // Soustraction de fraction1 et fraction2
    Fraction soustraction = fraction1.soustraction(fraction2);
    soustraction.afficher();  


    }
}
