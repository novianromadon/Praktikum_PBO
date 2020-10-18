package com.company.noviandwiromadon.LatihanModul2.no3;

public class DemoVMI {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Novian", "Pelajar", 3);
        Pacar pacar = new Pacar(mahasiswa.nama, mahasiswa.status, mahasiswa.semester, "Imagination", "2 tahun");

        System.out.println("MAHASISWA");
        mahasiswa.getStatus();

        System.out.println();

        System.out.println("PACAR");
        pacar.getStatus();
    }
}
