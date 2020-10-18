package com.company.noviandwiromadon.LatihanModul2.no2;

public class Kucing extends Binatang {
    String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    public void nama() {
        System.out.println("Nama    : " +nama);
        makan("wiskas");
        tidur("jam 10 malam");
    }

    public void meong() {
        System.out.println("Takdir  : mengeong");
    }
}