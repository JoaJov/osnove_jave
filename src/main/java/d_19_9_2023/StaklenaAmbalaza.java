package d_19_9_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean kaucijaFlase;
    private double osnovnaCena;

    public StaklenaAmbalaza() {
    }

    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucija, boolean kaucijaFlase, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.kaucijaFlase = kaucijaFlase;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isKaucijaFlase() {
        return kaucijaFlase;
    }

    public void setKaucijaFlase(boolean kaucijaFlase) {
        this.kaucijaFlase = kaucijaFlase;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        if (kaucijaFlase){
            return this.osnovnaCena * 1.2 + this.kaucija;
        }else{
            return this.osnovnaCena * 1.2;
        }
    }

        @Override
        public void stampaj(){
            System.out.println("Barkod:"+ this.barkod);
            System.out.println("Naziv"+ this.naziv);
            System.out.println("Tezina" + this.tezinaPakovanja);
            System.out.println("Kaucija" + this.kaucija);
        }
    }

