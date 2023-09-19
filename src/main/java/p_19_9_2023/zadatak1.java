package p_19_9_2023;

import java.util.ArrayList;

public class zadatak1 {
    public static void main(String[] args) {
        Kuca k=new Kuca("Veljka Milankovica 14", 500, 1,5);
        Kuca k1=new Kuca("Bulevar Djindjica 17", 1000, 2, 4);
        Zgrada z1=new Zgrada("Bulevar Djindjica 71", 600,3, 17);
        Zgrada z2=new Zgrada("Bulevar Djindjica 11", 400, 3,49);
        Zgrada z3=new Zgrada("Veljka Milankovica 11", 300, 1,20);

        PoreskaUprava uprava=new PoreskaUprava();

        uprava.dodajObjekat(k);
        uprava.dodajObjekat(k1);
        uprava.dodajObjekat(z1);
        uprava.dodajObjekat(z2);
        uprava.dodajObjekat(z3);

uprava.stampajSve();
        System.out.println("Objekat sa najvecim porezom: ");
        Objekat najveciPorez = uprava.najveciPorez();
        najveciPorez.stampaj();



    }
}
