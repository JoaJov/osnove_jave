package d_11_9_2023;

import java.sql.SQLOutput;

public class Knjiga {
    private Autor autor;
    private String naziv;
    private int isbn;

    private int godinaIzdanja;

    public Knjiga(){

    }

    public Knjiga (Autor autor, String naziv, int isbn, int godinaIzdanja){
        this.autor=autor;
        this.naziv=naziv;
        this.isbn=isbn;
        this.godinaIzdanja=godinaIzdanja;
    }
    public String getNaziv(){
        return this.naziv;
    }
    public void setNaziv(String naziv){
        this.naziv=naziv;
    }


    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor){
        this.autor=autor;
    }
    public int getIsbn(){
        return isbn;
    }
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }
    public int getGodinaIzdanja(){
        return godinaIzdanja;
    }
    public void setGodinaIzdanja(int godinaIzdanja){
        this.godinaIzdanja=godinaIzdanja;
    }
    public void stampaj(){
        System.out.println(this.isbn);
        System.out.println(this.naziv + "-" + this.godinaIzdanja);
        System.out.println(this.autor.getIme()+ this.autor.getPrezime());
    }
}

