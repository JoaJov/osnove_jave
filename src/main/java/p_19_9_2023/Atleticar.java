package p_19_9_2023;

public abstract class Atleticar {
    private String imeIprezime;
    protected double rezultat;

    public Atleticar(String imeIprezime, double rezultat) {
        this.imeIprezime = imeIprezime;
        this.rezultat = rezultat;
    }

    public abstract boolean rezultatAteticara(Atleticar atleticar);

    public void stampaj(){
        System.out.println(this.imeIprezime + this.rezultat);
    }

    public String getImeIprezime() {
        return imeIprezime;
    }
}
