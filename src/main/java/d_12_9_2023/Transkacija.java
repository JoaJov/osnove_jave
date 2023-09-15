package d_12_9_2023;

public class Transkacija {
    private String idTransakcije;
    private String primalac;
    private String uplatilac;

    public Transkacija(String number, Racun milan, Racun jovana) {
    }

    public Transkacija(String idTransakcije, String primalac, String uplatilac) {
        this.idTransakcije = idTransakcije;
        this.primalac = primalac;
        this.uplatilac = uplatilac;
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public String getPrimalac() {
        return primalac;
    }

    public void setPrimalac(String primalac) {
        this.primalac = primalac;
    }

    public String getUplatilac() {
        return uplatilac;
    }

    public void setUplatilac(String uplatilac) {
        this.uplatilac = uplatilac;
    }

    public void provizija(double iznos){
        if (iznos < 4500){
            return 45;
        } else {
            return iznos / 100;
    }
}

public void visinaTransakcije(double iznos){
        this.uplatilac.skinisaRacuna(iznos + provizija(iznos););
    this.primalac.uplata(iznos);
}
public void stampaj(){
    System.out.println("ID"+ this.idTransakcije);
    System.out.println("Racun sa");
    this.uplatilac.stampaj();
    System.out.println("Racun na");
    this.uplatilac.stampaj();

}
}
