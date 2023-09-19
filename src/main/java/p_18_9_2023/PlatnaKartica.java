package p_18_9_2023;

public abstract class PlatnaKartica {

    protected double suma;
    protected String brKartice;
    protected int godina;
    protected int mesec;

    public PlatnaKartica(double suma, String brKartice, int godina, int mesec) {
        this.suma = suma;
        this.brKartice = brKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrKartice() {
        return brKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }
    public double dodajSredstva(double iznos){
        this.suma=suma+ iznos;
        return iznos;
    }


    public void izvrsiTransakciju(double iznos){
        this.suma=this.suma - iznos;

}


public  abstract void stampaj();

}