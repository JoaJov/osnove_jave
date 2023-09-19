package p_19_9_2023;

public class Trkac extends Atleticar{

    public Trkac(String imeIprezime, double rezultat) {
        super(imeIprezime, rezultat);
    }

    @Override
    public boolean rezultatAteticara(Atleticar atleticar) {
        return this.rezultat < atleticar.rezultat;
    }


}
