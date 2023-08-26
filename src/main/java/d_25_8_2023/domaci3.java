package d_25_8_2023;

public class domaci3 {
    public static void main(String[] args) {
        printUser("1234567891", "Jovana", "Jovanovic", 2000, true);
    }
    public static void printUser (String jmbg, String ime, String prezime, int god, boolean aktivan){
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Goddina: " + god);
        System.out.println("Aktivan: " + aktivan);
    }
}
