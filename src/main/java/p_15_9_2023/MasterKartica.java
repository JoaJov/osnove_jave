package p_15_9_2023;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(double suma, String brKartice, int godina, int mesec) {
        super(suma, brKartice, godina, mesec);
    }

    @Override
    public void stampaj(){
        System.out.println("Master Card");
        super.stampaj();
    }
}
