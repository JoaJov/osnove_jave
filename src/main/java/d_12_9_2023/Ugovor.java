package d_12_9_2023;

public class Ugovor {
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private String datum;
    private double cena;
    private String adresa;

    public Ugovor() {

    }
    public Ugovor(FizickoLice prodavac, FizickoLice kupac, String datum, double cena, String adresa){
        this.prodavac=prodavac;
        this.kupac=kupac;
        this.datum=datum;
        this.cena=cena;
        this.adresa=adresa;
    }
    public double procenatZarade(){
     if (this.kupac.getKupovina()){
         return 0.02;
     }else {
         return 0.03;
     }

    }
    public double zaradaAgencije(){
        return 1000 + this.cena * this.procenatZarade();
    }
    
    public void stampaj() {
        System.out.print("Dana " + this.datum + " sklopljen je ugovor izmedju ");
        this.prodavac.stampaj();
        System.out.print(" i ");
        this.kupac.stampaj();
        System.out.print(" o kupovini nekretnine " + this.adresa + " po ceni od " + this.cena + "dinara pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zaradaAgencije() + " dinara");
    }
}

