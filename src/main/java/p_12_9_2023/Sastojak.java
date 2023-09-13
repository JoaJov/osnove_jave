package p_12_9_2023;

public class Sastojak {
    private String nazivSastojka;
    private double cena;

    public Sastojak(String nazivSastojka, double cena){
        this.nazivSastojka=nazivSastojka;
        this.cena=cena;
    }
    public String getNazivSastojka(){
        return this.nazivSastojka;
    }
    public double getCena(){
        return this.cena;
    }
    public void setNazivSastojka(String nazivSastojka){
        this.nazivSastojka=nazivSastojka;
    }
    public void setCena(double cena){
        this.cena=cena;
    }
}
