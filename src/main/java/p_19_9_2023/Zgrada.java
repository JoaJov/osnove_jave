package p_19_9_2023;

public class Zgrada extends Objekat{
    private int brojStanova;

    public Zgrada() {
    }

    @Override
    public double porez() {
        return this.povrsina * this.vracaKoeficijent() * this.brojStanova;
    }


    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
    public double izracunajPorez(){
        return this.vracaKoeficijent()* povrsina*brojStanova;

    }
    @Override
    public void stampaj(){
        System.out.println("Adresa je:" + this.adresa);
        System.out.println("Povrsina je:" + this.povrsina);
        System.out.println("Zona je:" + this.zona);
        System.out.println("Broj stanova je:" + this.brojStanova);
    }

}
