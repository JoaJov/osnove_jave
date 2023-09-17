package p_15_9_2023;

public class VisaKartica extends PlatnaKartica{
    private String ovlascenaOsoba;

    public VisaKartica(double suma, String brKartice, int godina, int mesec, String ovlascenaOsoba) {
        super(suma, brKartice, godina, mesec);
        this.ovlascenaOsoba = ovlascenaOsoba;
    }

    public String getOvlascenaOsoba() {
        return ovlascenaOsoba;
    }

    public void setOvlascenaOsoba(String ovlascenaOsoba) {
        this.ovlascenaOsoba = ovlascenaOsoba;
    }
    @Override
    public void stampaj(){
        System.out.println("Visa Kartica");
        super.stampaj();

    }
}
