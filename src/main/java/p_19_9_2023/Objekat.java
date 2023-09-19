package p_19_9_2023;

public abstract class Objekat {
    protected String adresa;
    protected double povrsina;
    protected int zona;

    public Objekat() {
    }

    public Objekat(String adresa, double povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
    public double vracaKoeficijent(){
        if (zona==1){
            return 1.4;
        }else if (zona==2){
            return 1.1;
        }else if (zona==3){
            return 1.05;
    }
        else {
            return 0;
        }
    }
        public abstract double porez();




public  abstract void stampaj();

}