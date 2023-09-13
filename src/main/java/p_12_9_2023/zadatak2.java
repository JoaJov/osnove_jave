package p_12_9_2023;

public class zadatak2 {
    public static void main(String[] args) {
     Korisnik korsnik1=new Korisnik();
     korsnik1.pretplata(100);
     Korisnik korisnik2=new Korisnik();

     ZoomCall call=new ZoomCall("htpp:/zoomcall.web", "2342433", korsnik1, korisnik2);

    }

}
