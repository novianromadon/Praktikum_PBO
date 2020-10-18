package com.company.noviandwiromadon.LatihanModul2.no3;

public class Mahasiswa {
    String nama, status;
    int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public void getStatus(){
        System.out.println("Nama            : " +nama);
        System.out.println("Status          : " +status);
        System.out.println("Semester        : " +semester);
    }
}