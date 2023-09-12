package p_11_9_2023;

public class Film {
    private String naziv;
    private int godina;
    private Reziser reziranFilm;

    public Film(){

    }
    public Film (String naziv, int godina){
        this.naziv=naziv;
        this.godina=godina;
    }
    public Film(String naziv, int godina, Reziser reziranFilm){
        this.naziv=naziv;
        this.godina=godina;
        this.reziranFilm=reziranFilm;
}
    public String getNaziv(){
        return this.naziv;

    }
    public void setNaziv(String naziv){
        this.naziv=naziv;
    }
    public int getGodina(){
        return this.godina;
    }
    public void setGodina(int godina){
        this.godina=godina;
    }
    public Reziser getReziranFilm(){
        return this.reziranFilm;
    }
    public void setReziranFilm(Reziser reziranFilm){
        this.reziranFilm=reziranFilm;
    }
    public void stampaj(){
        System.out.println("Film"+ this.naziv+ ","+ this.godina);
    }
}
