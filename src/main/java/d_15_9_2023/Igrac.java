package d_15_9_2023;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {
    }

    public Igrac(String imeIprezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imeIprezime, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
    public void stampaj(){
        System.out.println(this.imeIprezime  + ","  + this.jmbg + ","  + this.godRodjenja  + ","  +this.broj  + ","  + this.pozicija  + ","  +this.kapiten);
    }
}
