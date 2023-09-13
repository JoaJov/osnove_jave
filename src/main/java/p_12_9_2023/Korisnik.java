package p_12_9_2023;

public class Korisnik {
    private String fullName;
    private String licenca;
    private int duzinaPoziva;
    private int pretplata;


    public Korisnik(){
        licenca="basic";

    }
    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getLicenca(){
        return this.licenca;


    }
    public void pretplata (int pretplata){
        if (pretplata ==100){
            licenca="pro";

        }else if (pretplata==150){
            licenca="premium";
        }
    }
        public void ponistPretplatu (){
            licenca.equals("basic");
        }
        public int duzinaPoziva(){
            if (licenca.equals("basic")){
                return 40;
            }else if (licenca.equals("pro")){
                return 240;
        }
            return 0;
        }
        }
