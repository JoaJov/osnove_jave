package p_19_9_2023;

import java.util.ArrayList;

public class PoreskaUprava {

    private String grad;
    private ArrayList<Objekat> objekti;

    public PoreskaUprava() {
        objekti = new ArrayList<>();
    }

    public PoreskaUprava(String grad) {
        this.grad = grad;
        objekti = new ArrayList<>();
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public void dodajObjekat(Objekat o) {
        this.objekti.add(o);
    }


    public double ukupanPorez() {
        double suma = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            suma += this.objekti.get(i).porez();
        }
        return suma;
    }

    public void stampajSve() {
        for (int i = 0; i < this.objekti.size(); i++) {
            this.objekti.get(i).stampaj();
        }
        System.out.println("Ukupan porez" + this.ukupanPorez());
    }

    public Objekat najveciPorez() {

        Objekat najveci = this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            Objekat objekat = this.objekti.get(i);
            if (objekat.porez() > najveci.porez()) {
                najveci = this.objekti.get(i);
            }
        }


        return najveci;




    }

    public Objekat najmanjiPorez() {
        Objekat najmanji = this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            Objekat objekat = this.objekti.get(i);
            if (objekat.porez() < najmanji.porez()) {
                najmanji = this.objekti.get(i);
            }
        }
        return najmanji;

    }
}







