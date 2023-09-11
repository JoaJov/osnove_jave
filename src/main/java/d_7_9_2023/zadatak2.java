package d_7_9_2023;

import p_8_9_2023.Auto;

public class zadatak2 {
    public static void main(String[] args) {
    Automobil a=new Automobil();
    a.marka="Volkswagen";
    a.model="Golf 6";
    a.godProizvodnje=2009;
    Automobil b=new Automobil();
    b.marka="Kia";
    b.model="Sportage";
    b.godProizvodnje=2020;
    Automobil c=new Automobil();
    c.marka="Hyundai";
    c.model="Tucson";
    c.godProizvodnje=2020;

    System.out.println("Automoibil:"+a.marka+ ","+ a.model + ","+ a.godProizvodnje);
        System.out.println("Automoibil:"+b.marka+ ","+ b.model + ","+ b.godProizvodnje);
        System.out.println("Automoibil:"+c.marka+ ","+ c.model + ","+ c.godProizvodnje);


    }
}
