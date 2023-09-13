package p_12_9_2023;

public class Proizvod {
    private String nazivProizvoda;
    private  Kupac kupac;
    private double cena;
    public Proizvod(Kupac kupac, String nazivProizvoda,int cena){
        this.kupac=kupac;
        this.nazivProizvoda=nazivProizvoda;
        this.cena=cena;

    }
    public Proizvod(){

    }
    public String getNazivProizvoda(){
        return this.nazivProizvoda;
    }
    public void setNazivProizvoda(String nazivProizvoda){
        this.nazivProizvoda=nazivProizvoda;
    }
    public Kupac getKupac(){
        return this.kupac;
    }
    public void setKupac(Kupac kupac){
        this.kupac=kupac;
    }

    public double cena() {
        return this.cena * 1.9 * ((double) (100- this.kupac.getClanskaKarta().getPopust())/100);
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
public void stampaj (){
        System.out.println(this.nazivProizvoda+ this.cena);
}
    }

