package d_11_9_2023;

public class FacebookPost {
    private String opis;
    private Korisnik korisnik;

    public FacebookPost() {
    }

    public FacebookPost(String opis, Korisnik korisnik) {
        this.opis = opis;
        this.korisnik = korisnik;
    }

    public String getOpis() {
        return opis;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
    public void stampaj(){
        this.korisnik.stampaj();
        System.out.println(this.opis);
    }
}
