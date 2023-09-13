package p_12_9_2023;

public class ClanskaKarta {
    private double popust;
    private String brojKartice;

    public ClanskaKarta(){


}
public ClanskaKarta(int popust, String brojKartice){
        this.popust=popust;
        this.brojKartice=brojKartice;
}
    public double getPopust(){
        return this.popust;
    }
    public void setPopust(int popust){
        this.popust=popust;

    }
    public String getBrojKartice(){
        return this.brojKartice;
    }
    public void setBrojKartice(String brojKartice){
        this.brojKartice=brojKartice;
    }
    }
