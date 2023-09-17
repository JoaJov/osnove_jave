package d_15_9_2023;

public class zadatak2 {
    public static void main(String[] args) {
        Igracjedan igrac1=new Igracjedan("Jovana Jovanovic", "12345", 2000, 13,"napadac",true);

        Karton karton1=new Karton("crveni");
        Karton karton2=new Karton("zuti");


        igrac1.dodajkarton(karton1);
        igrac1.dodajkarton(karton1);
        igrac1.dodajkarton(karton2);
        igrac1.dodajkarton(karton2);

        igrac1.stampaj();
    }
}
