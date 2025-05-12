package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    private int codiceIMEI;
    private int memoria;

    public Smartphone(String nome, String marca, float prezzo, float iva, int codiceIMEI, int memoria) {

        // INVOCA IL COSTRUTTORE DELLA MIA SUPERCLASSE
        super(nome, marca, prezzo, iva);

        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;

    }

    public int getCodiceIMEI() {
        return this.codiceIMEI;
    }

    public void setCodiceIMEI(int codiceIMEI) {
        this.codiceIMEI = codiceIMEI;

    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

}
