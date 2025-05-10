package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String marca;
    private float prezzo;
    private float iva;


      public Prodotto (String nome, String marca, float prezzo, float iva){
        Random numero = new Random();
        this.codice = numero.nextInt(1000);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //METODO PER OTTENRE PREZZO BASE
    public float getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    //METODO PER OTTENERE PREZZO CON IVA
    public float getPrezzoIva(){
        return prezzo + (prezzo * iva / 100);
    }


    public void setPrezzoIva(int iva) {
        this.iva = iva;
    }

    //METODO PER OTTENERE NOME ESTESO (NOME+CODICE)
    public String getNomeCodice(){
        return nome + "-" + codice;
    }


    public int getCodice() {
        return codice;
    }



    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

   

    
}
