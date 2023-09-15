package d_12_9_2023;

public class FizickoLice {
    private String imeIPrezime;
    private String brojLicneKarte;
    private String jmbg;
    private boolean kupovina;

    public FizickoLice() {
    }

    public FizickoLice(String imeIPrezime, String brojLicneKarte, String jmbg, boolean kupovina) {
        this.imeIPrezime = imeIPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.kupovina =kupovina;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean getKupovina() {
        return kupovina;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime  + this.brojLicneKarte);
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

}
