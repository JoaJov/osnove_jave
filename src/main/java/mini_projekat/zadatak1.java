package mini_projekat;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite velicinu fajla");
        int velFajla=s.nextInt();
        int velPaketa=0;
        String sadrzaj="";

        for (int i=0; i<velFajla; i=velPaketa){
            System.out.println("Unesite paket");
            String paket=s.next();

            velPaketa=velFajla+paket.length();

            double skinutiFajl=1.0*velPaketa/velFajla*100;
            System.out.println("Skinut je"+ skinutiFajl+"%");
            sadrzaj=sadrzaj+paket;

            System.out.println("Sadrzaj fajla je"+sadrzaj);
        }
    }
}
