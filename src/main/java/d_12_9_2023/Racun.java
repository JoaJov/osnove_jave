package d_12_9_2023;

public class Racun {
    private String brojRacuna;
    private String imeIprezime;
    private double trenutnoStanje;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }
    public void uplata(double uplata){
        this.trenutnoStanje=trenutnoStanje + uplata;
    }
    public void skinisaRacuna(double isplata){
        this.trenutnoStanje=trenutnoStanje - isplata;
    }
    public void stampaj(){
        System.out.println(this.imeIprezime + "-"+ this.brojRacuna);
        System.out.println("Stanje na racunu"+ this.trenutnoStanje + "rsd");
    }
}
