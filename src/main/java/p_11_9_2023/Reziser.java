package p_11_9_2023;

public class Reziser {
    private String fullName;
    private int godina;


    public Reziser (){
}
public Reziser (String fullName, int godina){
        this.fullName=fullName;
        this.godina=godina;
}


public String getFullName(){
        return this.fullName;
}
public void setFullName(String fullName){
        this.fullName=fullName;
}
public int getGodina(){
        return this.godina;
}
public void setGodina(int godina){
        this.godina=godina;
}
public void stampaj(){
        System.out.println("Ime i prezime"+ this.fullName + ","+ this.godina);

}
}
