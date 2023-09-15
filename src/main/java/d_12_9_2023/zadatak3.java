package d_12_9_2023;

public class zadatak3 {
    public static void main(String[] args) {
       Racun jovana=new Racun();
       jovana.setImeIprezime("Jovana Jovanovic");
       jovana.setBrojRacuna("123-124");

       Racun milan=new Racun();
       milan.setImeIprezime("Milan Milanovic");
       milan.setBrojRacuna("345-678");

       Transkacija transkacija=new Transkacija("12333", milan, jovana);

       transkacija.visinaTransakcije(20000);
       transkacija.stampaj();

    }
}
