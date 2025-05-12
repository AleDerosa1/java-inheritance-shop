package org.lessons.java.shop;

public class Televisori extends Prodotto {

    private int dimensioni;
    private String smartTV;

    public Televisori(String nome, String marca, float prezzo, float iva, int dimensioni, String smartTV){

        super(nome, marca, prezzo, iva);

        this.dimensioni = dimensioni;
        this.smartTV = smartTV;
    }

      public int getDimensioni(){
    return this.dimensioni;
   }

   public void setDimensioni(int dimensioni){
    this.dimensioni = dimensioni;

   }

   public String getSmartTV(){
    return this.smartTV;
   }

   
   }
    

