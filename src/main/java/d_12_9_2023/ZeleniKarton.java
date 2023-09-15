package d_12_9_2023;

public class ZeleniKarton {
    private String imePrezime;
    private String profesor;
    private String index;
    private String nazivPredmeta;
    private int ocena;

    public ZeleniKarton(){

    }
    public ZeleniKarton(String imePrezime,  String index, String nazivPredmeta, int ocena){
        this.imePrezime=imePrezime;
        this.index=index;
        this.nazivPredmeta=nazivPredmeta;
        this.ocena=ocena;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean ispit(){
        if (this.ocena > 5){
            return true;
        } else {
            return false;
        }
    }
        public void stampaj(){
            System.out.println(this.nazivPredmeta  +"-"  +this.ocena);
            System.out.println("Student"+ this.imePrezime + "broj indexa"+ this.index);
            System.out.println("Profesor"+ this.profesor);

}
}