package d_8_9_2023;

public class domaci1 {
    public static void main(String[] args) {
Proizvod a=new Proizvod();
a.naziv="Sladoled";
a.cena=130;
a.tezina=100;

Proizvod b=new Proizvod();
b.naziv="Cokolada";
b.cena=200;
b.tezina=150;

a.stampaj();
b.stampaj();

a.povecaj(50);
b.povecaj(100);

a.vratiCenuSaPopustom(10);
b.vratiCenuSaPopustom(20);

a.racunajPostarinu();
        b.racunajPostarinu();

    }
}
