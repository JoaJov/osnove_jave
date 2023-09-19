package p_19_9_2023;

public class Lokal extends Objekat{
    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public boolean porez() {
        return 0;
    }

    public double Izracunajporez(){
        return this.vracaKoeficijent()* this.povrsina*1.3;


    }


    @Override
    public void stampaj(){
        System.out.println("Adresa je:" + this.adresa);
        System.out.println("Povrsina je:" + this.povrsina);
        System.out.println("Zona je:" + this.zona);

}
}
