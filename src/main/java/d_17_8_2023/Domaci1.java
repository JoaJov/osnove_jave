package d_17_8_2023;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite ime");
        String ime=s.next();
        System.out.println("Unesite prezime");
        String prezime=s.next();
        System.out.println("Unesite godinu rodjenja");
        int god=s.nextInt();
        System.out.println(ime + " " + prezime + " - " + god + " god");

    }
}
