package d_11_9_2023;

public class Autor {
    private String ime;
    private String prezime;

  public Autor(){

  }
    public Autor(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;

    }
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
    public void stampaj(){
        System.out.println(this.ime  + this.prezime);
    }
}
