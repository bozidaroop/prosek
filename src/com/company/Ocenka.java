package com.company;

public class Ocenka {
    private String predmet, datum;
    private int ocenka;

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getOcenka() {
        return ocenka;
    }

    public void setOcenka(int ocenka) {
        this.ocenka = ocenka;
    }

    public String toString(){
        return "Predmet: " + getPredmet() + ", Datum na polaganje: " + getDatum() + ", Ocenka: "
                + getOcenka();
    }

}
