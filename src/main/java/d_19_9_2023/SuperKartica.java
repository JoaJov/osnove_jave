package d_19_9_2023;

public class SuperKartica {
    private String brojKartice;
    private String imeIprezime;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(String brojKartice, String imeIprezime, double popust) {
        this.brojKartice = brojKartice;
        this.imeIprezime = imeIprezime;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
    public void stampaj(){
        System.out.println("BROJ KARTICE:" + this.brojKartice + "," + "IME I PREZIME:" + this.imeIprezime);
    }
}
