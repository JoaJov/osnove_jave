package d_19_9_2023;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Ambalaza>ambalaze;

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }
    public void dodajAmbalazu(Ambalaza ambalaza){
        ambalaze.add(ambalaza);
    }
    public void izbaciAmbalazu(String barkod){
        for (int i=0; i< this.ambalaze.size(); i++){
            if (this.ambalaze.get(i).getBarkod().equals(barkod)){
                this.ambalaze.remove(i);
            }
        }
    }

}
