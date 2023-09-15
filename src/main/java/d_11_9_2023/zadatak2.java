package d_11_9_2023;

public class zadatak2 {
    public static void main(String[] args) {

        Korisnik korisnik1=new Korisnik();
        korisnik1.setIme("Jovana");
        korisnik1.setPrezime("Jovanovic");

        FacebookPost facebookPost=new FacebookPost();
        facebookPost.setKorisnik(korisnik1);
        facebookPost.setOpis("Srecan rodjendan");


        facebookPost.stampaj();
    }
}
