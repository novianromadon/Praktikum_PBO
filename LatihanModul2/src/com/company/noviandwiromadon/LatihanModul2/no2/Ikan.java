package com.company.noviandwiromadon.LatihanModul2.no2;

public class Ikan extends Binatang {
    String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    public void nama() {
        System.out.println("Nama    : " +nama);
        makan("pelet");
        tidur("jam 9 malam");
    }

    public void berenang() {
        System.out.println("Takdir  : berenang");
    }
}
