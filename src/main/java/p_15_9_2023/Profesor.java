package p_15_9_2023;

public class Profesor extends Osoba {
    private String nazivPredmeta;
    private double iznosPlate;


    public Profesor(String imeIprezime, String jmbg, String nazivPredmeta) {
        super(imeIprezime, jmbg);
    }


    public Profesor(String nazivPredmeta, double iznosPlate) {
        this.nazivPredmeta=nazivPredmeta;
        this.iznosPlate=iznosPlate;

    }
    public Profesor(String imeIprezime,String nazivPredmeta,String jmbg,double iznosPlate ){
        super(imeIprezime,jmbg);


    }

        public String getNazivPredmeta() {
            return nazivPredmeta;
        }

        public void setNazivPredmeta(String nazivPredmeta) {
            this.nazivPredmeta = nazivPredmeta;
        }

        public double getIznosPlate() {
            return iznosPlate;
        }
    public void setIznosPlate(double iznosPlate) {
        this.iznosPlate = iznosPlate;
    }


    public void povecajPlatu(double unos){
        this.iznosPlate=this.iznosPlate  +(this.iznosPlate *(unos/100)) ;
    }


    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Predmet"+ this.nazivPredmeta + ","+ "Plata"+ this.iznosPlate);

    }
}




