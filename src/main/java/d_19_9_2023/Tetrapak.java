package d_19_9_2023;

public class Tetrapak extends Ambalaza{
    private boolean reciklaza;
    private double osnovnaCena;

    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean reciklaza, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak() {
    }

    public boolean isReciklaza() {
        return reciklaza;
    }

    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cena(){
        if (this.reciklaza){
            return this.tezinaPakovanja()* 1.5+ this.osnovnaCena;
        }else{
            return this.osnovnaCena;
        }
    }
    @Override
    public void stampaj(){
        System.out.println("Barkod:"+ this.barkod);
        System.out.println("Naziv"+ this.naziv);
        System.out.println("Neto tezina" + this.netoTezina);
        System.out.println("Bruto tezina" + this.brutoTezina);
    }
}
