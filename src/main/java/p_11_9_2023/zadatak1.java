package p_11_9_2023;

public class zadatak1 {
    public static void main(String[] args) {
    Student a=new Student();
    a.setIme("Jovana");
    a.setPrezime("Jovanovic");
    a.setIndex(123);
    a.setBudzet(true);

    String b= a.getIme();
    String c=a.getPrezime();
    int d=a.getIndex();

a.stampaj();
    }
}
