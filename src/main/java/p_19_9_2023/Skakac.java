package p_19_9_2023;

public class Skakac extends Atleticar{
    public Skakac(String imeIprezime, double rezultat) {
        super(imeIprezime, rezultat);
    }
    @Override
    public boolean rezultatAteticara(Atleticar atleticar){
        return this.rezultat >atleticar.rezultat;

    }
}
