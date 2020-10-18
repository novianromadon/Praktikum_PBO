package com.company.noviandwiromadon.Modul2.Polimorfisme;

public class Y extends X {
    @Override
    // mencetak hasil dari Y
    public void getValue(String value){
        // mengakses class parent
        super.getValue(value);
        System.out.println("Value class Y : "+value);
    }
}