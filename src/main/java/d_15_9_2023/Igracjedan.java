package d_15_9_2023;

import java.util.ArrayList;

public class Igracjedan extends Osobajedan{
    private int broj;
    private String pozicija;
    private boolean kapiten;
    ArrayList<Karton>kartoni=new ArrayList<>();

    public Igracjedan() {

    }

    public Igracjedan(String imeIprezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean kapiten) {
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
    public void dodajkarton(Karton karton){
        this.kartoni.add(karton);
    }
    public int brZutihKartona(){
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (kartoni.get(i).getTipKartona().equals("zuti")){
                counter++;
            }
        }
        return counter;
    }

    public int brCrvenihKartona(){
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (kartoni.get(i).getTipKartona().equals("crveni")) {
                counter++;
            }
        }
        return counter;
}


@Override
public void stampaj(){
    System.out.println( this.pozicija + ","+ this.broj + ","+ this.kapiten + ","+ this.kartoni );
    super.stampaj();

}
}
