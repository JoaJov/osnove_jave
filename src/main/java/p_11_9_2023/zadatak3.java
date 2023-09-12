package p_11_9_2023;

public class zadatak3 {
    public static void main(String[] args) {
        Film a=new Film("Kad jaganjci utihnu", 1991);

        Film b=new Film();
        b.setNaziv("Insomnia");
        b.setGodina(1990);

        a.stampaj();
        b.stampaj();

        Reziser c=new Reziser();
        c.setGodina(70);
        c.setFullName("Dusan Kovacevic");

        Reziser reziser=new Reziser("Quentin Tarantino", 60);

        Film z=new Film("Kad jagagnjci uthnu", 1991, reziser);

        Film y=new Film();
        y.setNaziv("Tesna koza");
        y.setGodina(2000);
        y.setReziranFilm(reziser);



    }
}
