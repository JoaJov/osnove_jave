package p_11_9_2023;

public class Student {
    private String ime;
    private String prezime;
    private int index;
    private boolean budzet;

    public String getIme(){
        return this.ime;

    }
     public void setIme(String ime){
        this.ime=ime;
     }
     public String getPrezime(){
        return this.prezime;
     }
     public void setPrezime(String prezime){
        this.prezime=prezime;
     }
     public int getIndex(){
        return this.index;
     }
     public void setIndex(int index){
        this.index=index;
     }
     public boolean getBudzet(){
        return this.budzet;
     }
     public void setBudzet(boolean budzet){
        this.budzet=budzet;

}
public void stampaj(){
        System.out.println(this.ime +"," + this.prezime + ","+ this.index + ","+ this.budzet);
}
}
