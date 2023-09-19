package p_19_9_2023;

public class Kuca extends Objekat{

    private int brojClanova;
    private double povrsina;

    public Kuca() {
    }



    public Kuca(String adresa, double povrsina, int zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;

    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double getPovrsina() {
        return povrsina;
    }

    @Override
    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    @Override
    public boolean porez() {
        return false;
    }

    @Override
    public void stampaj(){
        System.out.println("Adresa je:" + this.adresa);
        System.out.println("Povrsina je:" + this.povrsina);
        System.out.println("Zona je:" + this.zona);
        System.out.println("Broj clanova je:" + this.brojClanova);
    }
}
