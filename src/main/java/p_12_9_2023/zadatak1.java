package p_12_9_2023;

public class zadatak1 {
    public static void main(String[] args) {

        ClanskaKarta clanskaKarta=new ClanskaKarta();
        clanskaKarta.setBrojKartice("1232-1233");
        clanskaKarta.setPopust(10);
        double x=clanskaKarta.getPopust()*100 ;

        Kupac jovana=new Kupac("Jovana Jovanovic", clanskaKarta);


        Proizvod cokolada=new Proizvod(jovana, "cokolada", 100);
        cokolada.setKupac(jovana);
        cokolada.stampaj();









    }
}
