package d_14_9_2023;

import java.util.ArrayList;

public class Student {
    private String brIndexa;
    private String imeIprezime;
    private String tip;
    ArrayList<Ispit>ispiti=new ArrayList<>();

    public Student() {
    }

    public Student(String brIndexa, String imeIprezime, String tip) {
        this.brIndexa = brIndexa;
        this.imeIprezime = imeIprezime;
        this.tip = tip;

    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
    public void dodajIspit(Ispit ispiti){
        this.ispiti.add(ispiti);
    }
    public double izracunajProsek(){
        int suma =0;
        int counter =0;
        for (int i=0; i<this.ispiti.size(); i++){
            if (this.ispiti.get(i).polozenIspit()){
                suma = suma + this.ispiti.get(i).getOcena();
                counter++;

            }
        }
            return suma / counter;
    }
    public void stampaj(){
        System.out.println(this.brIndexa + "," + this.imeIprezime + "," + this.tip);
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampaj();
        }
        System.out.println("Prosecna ocena: " + izracunajProsek());
    }
}
