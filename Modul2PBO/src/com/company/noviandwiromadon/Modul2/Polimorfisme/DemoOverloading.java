package com.company.noviandwiromadon.Modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Yoru ni Kakeru", "YOASOBI");
        Lagu lagu2 = new Lagu("Blue Bird", "Naruto");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}