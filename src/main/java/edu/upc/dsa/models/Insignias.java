package edu.upc.dsa.models;

public class Insignias {

    String nomInsignia;
    String fotoInsignia;

    public Insignias() {
    }

    public Insignias(String nomInsignia, String fotoInsignia) {
        this.nomInsignia = nomInsignia;
        this.fotoInsignia = fotoInsignia;
    }

    public String getNomInsignia() {
        return nomInsignia;
    }

    public void setNomInsignia(String nomInsignia) {
        this.nomInsignia = nomInsignia;
    }

    public String getFotoInsignia() {
        return fotoInsignia;
    }

    public void setFotoInsignia(String fotoInsignia) {
        this.fotoInsignia = fotoInsignia;
    }
}
