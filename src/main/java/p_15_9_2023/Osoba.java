package p_15_9_2023;

public class Osoba {
    protected String imeIprezime;
    protected String jmbg;

public Osoba(){
}

    public Osoba(String imeIprezime, String jmbg) {
        this.imeIprezime = imeIprezime;
        this.jmbg = jmbg;
    }
    public void stampaj(){
        System.out.println(this.imeIprezime + this.jmbg);
    }
}
