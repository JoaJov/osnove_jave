package p_12_9_2023;

public class ZoomCall {
    private Korisnik host;
    private Korisnik guest;
    private String password;
    private String link;

    public ZoomCall(String link, String password, Korisnik host, Korisnik guest){
        this.guest=guest;
        this.host=host;
        this.link=link;
        this.password=password;
    }
    public String getLink(){
        return this.link;
    }
    public String getPassword(){
        return this.password;
    }
    public void setGuest(Korisnik guest){
        this.guest=guest;
    }

    public Korisnik getHost(){
        return this.host;
    }


    public void stampaj() {
        System.out.println("ZoomCall"+ this.link);
        System.out.println("Password"+ this.password);
        System.out.println(this.guest.getFullName() + "Ime i prezime" );
        System.out.println(this.host );
        System.out.println("Maksimalno trajanje poziva"+ guest);

    }
}


