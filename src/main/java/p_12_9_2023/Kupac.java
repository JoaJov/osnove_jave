package p_12_9_2023;

public class Kupac {
    private String fullName;
    private ClanskaKarta clanskaKarta;

    public Kupac(String fullName,ClanskaKarta clanskaKarta){
        this.fullName=fullName;
        this.clanskaKarta=clanskaKarta;

    }
    public Kupac(){

    }
    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }

    public ClanskaKarta getClanskaKarta() {
        return this.clanskaKarta;
    }

    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }

    }

