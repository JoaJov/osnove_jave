package p_11_9_2023;

public class zadatak2 {
    public static void main(String[] args) {
        Tacka a=new Tacka(30, 40);

        Tacka b=new Tacka();
        b.setX(10);
        b.setY(20);
        a.stampaj();
        b.stampaj();
    }

}
