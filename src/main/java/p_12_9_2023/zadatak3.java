package p_12_9_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        ArrayList<Sastojak> sastojci=new ArrayList<>();
        Sastojak sastojci2=new Sastojak("Brasno", 240);
        Sastojak sastojci3=new Sastojak("Secer",300);
        Sastojak sastojci4=new Sastojak("So", 140);

        sastojci.add(sastojci2);
        sastojci.add(sastojci3);
        sastojci.add(sastojci4);

        Scanner s=new Scanner(System.in);

        System.out.println("Unesite N");
        int n=s.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("Unesite cenhu");
            int cena=s.nextInt();
            for (int i=0; i<sastojci.size(); i++){


    }
}
}
}