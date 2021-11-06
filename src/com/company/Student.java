package com.company;

public class Student extends Covek {
    public Ocenka[] getOcenki() {
        return ocenki;
    }

    public void setOcenki(Ocenka[] ocenki) {
        this.ocenki = ocenki;
    }

    public void setOcenka(Ocenka ocenka){
        if(ocenka == null) return;

        Ocenka[] noviOcenki = new Ocenka[this.ocenki.length + 1];
        // Kopiraj prethodni ocenki
        for (int i=0; i< ocenki.length; i++){
            noviOcenki[i] = ocenki[i];
        }

        // Dodaj nova ocenka
        noviOcenki[noviOcenki.length - 1] = ocenka;

        ocenki = noviOcenki;
    }

    private Ocenka[] ocenki;

    public float getProsek() {
        float prosek = 0;

        for(int i=0; i<ocenki.length; i++){
            prosek += ocenki[i].getOcenka();
        }
        prosek = prosek / ocenki.length;

        return prosek;
    }

    public Student(){
        ocenki = new Ocenka[0];
    }


    public String toString(){
        Covek c = new Covek();
        c.setAge(getAge());
        c.setName(getName());
        return c.toString() + "Prosek: " + getProsek();
    }

}
