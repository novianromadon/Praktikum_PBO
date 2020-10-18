package com.company.noviandwiromadon.LatihanModul2.no2;

public class Burung extends Binatang {
    String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    public void nama() {
        System.out.println("Nama    : " +nama);
        makan("jangkrik");
        tidur("jam 8 malam");
    }

    public void terbang() {
        System.out.println("Takdir  : terbang");
    }
}
