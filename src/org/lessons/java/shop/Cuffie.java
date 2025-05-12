package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    private String colore;
    private String wireless;
    
    public Cuffie(String nome, String marca, float prezzo, float iva, String colore, String wireless){

        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;

    }

    public String getColore(){
    return this.colore;
   }

   public void setColore(String colore){
    this.colore = colore;

   }

   public String getWireless(){
    return this.wireless;
   }

   public void setWireless(String wireless){
    this.wireless = wireless;
   }
}
