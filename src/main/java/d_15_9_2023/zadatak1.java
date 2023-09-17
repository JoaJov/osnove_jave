package d_15_9_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
     Igrac igrac1=new Igrac("Jovana Jovanovic", "12345", 2000, 13,"napadac",true);
     Igrac igrac2=new Igrac("Nikola Nikolic","33333", 1999, 23,"odbrambeni", false);


     Trener trener1=new Trener("Rados Bajic", "6666", 1974, 11,"kondicioni");
     Trener trener2=new Trener("Ljubisa Samardzic", "123-345", 1966, 20, "personalni");


     igrac1.stampaj();
     igrac2.stampaj();

     trener1.stampaj();
     trener2.stampaj();

        Scanner input =new Scanner(System.in);

        ArrayList<Igrac> igraci=new ArrayList<>();
        ArrayList<Trener> treneri=new ArrayList<>();

        System.out.println("Koliko igraca zelite da unesete: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Unesite ime i prezime igraca: ");
            String ime = input.next();
            System.out.println("Unesite jmbg: ");
            String jmbg = input.next();
            System.out.println("Unesite god rodjenja:");
            int godina = input.nextInt();
            System.out.println("Unesite broj koji igrac nosi:");
            int broj = input.nextInt();
            System.out.println("Unesite poziciju:");
            String pozicija = input.next();
            System.out.println("Da li je kapiten: ");
            String odgovor = input.next();

            boolean kapiten = false;
            if (odgovor.equals("da")) {
                kapiten = true;
            }

            igraci.add(new Igrac(ime, jmbg, godina, broj, pozicija, kapiten));

        }
        System.out.println("Koliko trenera zelite da unesete: ");
        int b = input.nextInt();

        for (int i = 0; i < b; i++) {
            System.out.println("Unesite ime i prezime trenera: ");
            String ime = input.next();
            System.out.println("Unesite jmbg: ");
            String jmbg = input.next();
            System.out.println("Unesite godinu rodjenja:");
            int godina = input.nextInt();
            System.out.println("Unesite godine iskustva:");
            int iskustvo = input.nextInt();
            System.out.println("Unesite tip:");
            String tip = input.next();

            treneri.add(new Trener(ime, jmbg, godina, iskustvo, tip));
        }

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
        }
        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();

        }
}
