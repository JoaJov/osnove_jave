package p_18_9_2023;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(double suma, String brKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public void stampaj(){
        System.out.println("VISA KARTICA:"+this.brKartice + "," + this.mesec + "/"+ this.godina + ","+ "$ " + this.suma);
    }
}
