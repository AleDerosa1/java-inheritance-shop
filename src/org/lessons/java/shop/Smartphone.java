package org.lessons.java.shop;

public class Smartphone extends Prodotto {

     public int codiceIMEI;
    public int memoria;

    public Smartphone(String nome, String marca, float prezzo, float iva, int codiceIMEI, int memoria){

        //INVOCA IL COSTRUTTORE DELLA MIA SUPERCLASSE
        super(nome , marca , prezzo , iva);

        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;

    }

   public int getCodiceIMEI(){
    return this.codiceIMEI;
   }

   public int getMemoria(){
    return this.memoria;
   }
   
    
}
