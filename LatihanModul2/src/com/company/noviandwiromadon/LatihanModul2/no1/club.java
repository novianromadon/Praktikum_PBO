package com.company.noviandwiromadon.LatihanModul2.no1;

public class club {
    public String nama, stadion, deskripsi;
    public int tahunBerdiri, juaraUcl;

    //constructure kosong
    public club() {
    }

    //constructure 1 parameter
    public club(String nama) {
        this.nama = nama;
    }

    //constructure 2 parameter
    public club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    //constructure 3 parameter
    public club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    //constructure 5 parameter
    public club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    //method getTeam
    public void getTeam() {
        if(nama == null){
            nama = "Bayer Munchen";
        }
        if (stadion == null){
            stadion = "Allianz Arena";
        }
        if(deskripsi == null){
            deskripsi = "Tim terkaya";
        }
        if (tahunBerdiri == 0){
            tahunBerdiri = 1500;
        }
        if (juaraUcl == 0){
            juaraUcl = 66;
        }

        System.out.println("Nama          : " +nama);
        System.out.println("Stadion       : " +stadion);
        System.out.println("Deskripsi     : " +deskripsi);
        System.out.println("Tahun Berdiri : " +tahunBerdiri);
        System.out.println("Juara UCL     : " +juaraUcl);
    }
}
