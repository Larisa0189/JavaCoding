package Exercices.Persoane;

public class Main {
    public static void main(String[] args) {
        Persoane persoana1 = new Persoane();
        persoana1.nume = "Larisa";
        persoana1.sexul = "fata";
        persoana1.varsta = 21;
        persoana1.culoareaOchilor = "caprui";
        persoana1.culoareaParului = "roscat";
        persoana1.inaltimea = 1.65f;
        persoana1.areFrati = true;
        persoana1.printAllParameters();

        Persoane persoana2 = new Persoane();
        persoana2.nume = "Andrei";
        persoana2.sexul = "masculin";
        persoana2.varsta = 24;
        persoana2.culoareaOchilor = "albastru";
        persoana2.culoareaParului = "blond";
        persoana2.inaltimea = 1.92f;
        persoana2.areFrati = true;
        persoana2.printAllParameters();

        Persoane persoana3 = new Persoane("Minu", "masculin", 21, "caprui", "saten", 1.89f, true);
        persoana3.printAllParameters();
        Persoane persoane4 = new Persoane("Luminita", "feminin", 24, "albastru", "blond", 1.50f, true);
        persoane4.printAllParameters();
    }
}
