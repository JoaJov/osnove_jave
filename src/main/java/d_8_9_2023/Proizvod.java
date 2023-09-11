package d_8_9_2023;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj(){
        System.out.println(this.naziv+ ", " + this.cena + " rsd, " + this.tezina + " gr");
    }
public void povecaj(double povecanje){
        this.cena=this.cena + povecanje;
}
    public double vratiCenuSaPopustom(double popust){
        return this.cena - (this.cena * (popust/100.0));
}
    public double racunajPostarinu(){
        if (this.tezina <= 100) {
            return 200;
        } else if (this.tezina >= 101 && this.tezina <= 500) {
            return 400;
        } else {
            return 1000;
}
    }
}
