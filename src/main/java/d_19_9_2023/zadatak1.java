package d_19_9_2023;

public class zadatak1 {
    public static void main(String[] args) {
     Korpa korpa=new Korpa();
     SuperKartica superKartica=new SuperKartica("123-123", "Jovana Jovanovic",10);
     StaklenaAmbalaza staklenaAmbalaza=new StaklenaAmbalaza("12234","Sok", 30, 49,20, true, 100 );


        korpa.dodajAmbalazu(new Tetrapak("123", "Mleko", 40, 70, true, 100));
        korpa.dodajAmbalazu(new StaklenaAmbalaza("1234", "Sok", 60, 70, 50, true, 200));
        korpa.dodajAmbalazu(new Tetrapak("123456", "Jogurt", 90, 100, false, 300));


        System.out.println(staklenaAmbalaza.cena());
        for (int i = 0; i < korpa.getAmbalaze().size(); i++) {
            korpa.getAmbalaze().get(i).stampaj();
    }
    }
}

