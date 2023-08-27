package Exercices.Persoane;

public class Persoane {
    String sexul;
    String nume;
    int varsta;
    String culoareaOchilor;
    String culoareaParului;
    float inaltimea;
    boolean areFrati;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void setAreFrati(boolean areFrati) {
        this.areFrati = areFrati;
    }

    public void setCuloareaOchilor(String culoareaOchilor) {
        this.culoareaOchilor = culoareaOchilor;
    }

    public void setCuloareaParului(String culoareaParului) {
        this.culoareaParului = culoareaParului;
    }

    public void setInaltimea(float inaltimea) {
        this.inaltimea = inaltimea;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSexul(String sexul) {
        this.sexul = sexul;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Persoane(String nume, String sexul, int varsta, String culoareaOchilor, String culoareaParului, float inaltimea, boolean areFrati) {
        this.nume = nume;
        this.sexul = sexul;
        this.varsta = varsta;
        this.culoareaOchilor = culoareaOchilor;
        this.culoareaParului = culoareaParului;
        this.inaltimea = inaltimea;
        this.areFrati = areFrati;
    }

    public Persoane() {

    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////


    public float getInaltimea() {
        return inaltimea;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getCuloareaOchilor() {
        return culoareaOchilor;
    }

    public String getCuloareaParului() {
        return culoareaParului;
    }

    public String getNume() {
        return nume;
    }

    public String getSexul() {
        return sexul;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    public void printAllParameters() {
        System.out.println(String.format("%s are datele urmatoare: sexul: %s, varsta de %s ani, culoarea ochilor %s, culoarea parului %s," +
                " inaltimea de %s,aceasta persoala are frati: %s", nume, sexul, varsta, culoareaOchilor, culoareaParului, inaltimea, areFrati));
    }
}
