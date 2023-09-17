package p_15_9_2023;

public class zadatak2 {
    public static void main(String[] args) {
     VisaKartica visaKartica=new VisaKartica(400,"234-434",2032, 12,"Jovana Jovanovic");
     MasterKartica masterKartica=new MasterKartica(500, "11-111",2023, 11);

           visaKartica.stampaj();
           masterKartica.stampaj();

    }

}
