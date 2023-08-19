package d_18_8_2023;

import java.util.Scanner;

public class domaci2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite ime");
        String ime=s.next();
        System.out.println("Unesite prezime");
        String prezime=s.next();
        System.out.println("Unesite jmbg");
        int jmbg=s.nextInt();
        System.out.println("Unesite broj primeraka");
        int broj=s.nextInt();

        for (int i = 1; i <= broj; i++) {
            System.out.println("Primerak"+ i);
            System.out.println("*****************************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("*****************************");
        }

    }
}
