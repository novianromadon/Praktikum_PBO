package com.company.noviandwiromadon.LatihanModul2.no3;

public class Pacar extends Mahasiswa {
    String namaPacar, lamaHubungan;

    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }

    @Override
    public void getStatus() {
        super.getStatus();
        System.out.println("Nama pacar      : " +namaPacar);
        System.out.println("Lama hubungan   : " +lamaHubungan);
    }
}