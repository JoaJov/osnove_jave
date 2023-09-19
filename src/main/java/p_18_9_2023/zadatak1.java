package p_18_9_2023;

public class zadatak1 {
    public static void main(String[] args) {
    VisaKartica visaKartica=new VisaKartica(200,"123-1234", 2023, 12, "Jovana Jovanovic");
    MasterKartica masterKartica=new MasterKartica(300, "333-2222", 2024,10);

    visaKartica.stampaj();
    masterKartica.stampaj();

    }
}
