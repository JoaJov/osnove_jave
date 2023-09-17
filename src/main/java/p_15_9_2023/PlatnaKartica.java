package p_15_9_2023;

public class PlatnaKartica {
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
    public void dodajSredstva(double iznos){
        this.suma=this.suma + iznos;

    }
    public void izvrsiTransakciju(double iznos){
        this.suma=this.suma - iznos;
    }
    public void stampaj(){
        System.out.println( this.brKartice + "," + this.mesec + "/"+this.godina +"," +"$" + this.suma);
    }
}
