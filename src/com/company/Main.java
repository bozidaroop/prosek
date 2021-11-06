package com.company;

public class Main {

    public static void main(String[] args) {
	Student s = new Student();
    s.setAge(20);
    s.setName("Bozidar");

    Ocenka ocenka1 = new Ocenka();
    ocenka1.setPredmet("OOP");
    ocenka1.setDatum("22.11.2021");
    ocenka1.setOcenka(10);

    Ocenka ocenka2 = new Ocenka();
    ocenka2.setPredmet("ASP");
    ocenka2.setDatum("23.11.2021");
    ocenka2.setOcenka(8);

    s.setOcenka(ocenka1);
    s.setOcenka(ocenka2);


    System.out.println(s.toString());
    for (int i=0; i<s.getOcenki().length; i++){
        System.out.println(s.getOcenki()[i].toString());
    }

    }
}
