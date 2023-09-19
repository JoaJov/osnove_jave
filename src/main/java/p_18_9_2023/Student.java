package p_18_9_2023;

public abstract class Student {
    protected String imeIprezime;
    protected int brIndexa;
    protected int godStudija;

    public Student(String imeIprezime, int brIndexa, int godStudija) {
        this.imeIprezime = imeIprezime;
        this.brIndexa = brIndexa;
        this.godStudija = godStudija;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getGodStudija() {
        return godStudija;
    }

    public void setGodStudija(int godStudija) {
        this.godStudija = godStudija;
    }
    public abstract boolean budzet();


public abstract int skolarina();


    public void stampaj(){
        System.out.println(this.imeIprezime  + ","  + this.godStudija  + "," + this.brIndexa);
        if (this.budzet()){
            System.out.println("Finansiranje: budzet" );
        } else{
            System.out.println("Finansiranje: samofinansirajuci");
        }
        System.out.println("Cena skolarine:" + this.skolarina());
     }
}