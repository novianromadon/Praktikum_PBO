package com.company.noviandwiromadon.LatihanModul2.no2;

public class demoBinatang {
    public static void main(String[] args) {
        //Inisialisasi
        Burung burung = new Burung("Jalak");
        Ikan ikan = new Ikan("Lele");
        Kucing kucing = new Kucing("Persia");

        //pemanggilan method
        burung.nama();
        burung.terbang();

        System.out.println();

        ikan.nama();
        ikan.berenang();

        System.out.println();

        kucing.nama();
        kucing.meong();
    }
}
