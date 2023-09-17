package d_15_9_2023;

public class Trener extends Osoba{
    private int iskustvo;
    private String tipTrenera;

    public Trener(String imeIprezime, String jmbg, int godRodjenja, int iskustvo, String tipTrenera) {
        super(imeIprezime, jmbg, godRodjenja);
        this.iskustvo = iskustvo;
        this.tipTrenera = tipTrenera;
    }

    public int getIskustvo() {
        return iskustvo;
    }

    public void setIskustvo(int iskustvo) {
        this.iskustvo = iskustvo;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }
    public void stampaj(){
        System.out.println(this.imeIprezime  + ","  + this.jmbg + ","  + this.godRodjenja  + ","  +this.tipTrenera + "," + this.iskustvo);
    }
}
