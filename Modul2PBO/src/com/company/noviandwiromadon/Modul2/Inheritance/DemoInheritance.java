package com.company.noviandwiromadon.Modul2.Inheritance;

import com.company.noviandwiromadon.Modul2.Inheritance.A;
import com.company.noviandwiromadon.Modul2.Inheritance.B;

public class DemoInheritance {
    public static void main(String[] args) {
        A superClass = new A();
        B subClass = new B();

        System.out.println("Masukkan data ke SuperClass");
        superClass.x = 3;
        superClass.y = 4;
        superClass.printXy();

        // member superclass dapat diakeses ke subclass
        // sub class nya
        System.out.println("Masukkan data ke SubClass");
        subClass.x = 30;
        subClass.y = 40;
        subClass.z = 10;
        subClass.printXy();
        subClass.sumValue();
    }
}