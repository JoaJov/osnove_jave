package p_17_8_2023;

import java.util.Scanner;

public class UvodScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ime");
        String ime =scanner.next();
        System.out.println("Unesite prezime");
        String prezime=scanner.next();
        System.out.println("Unesite broj telefona");
        String broj=scanner.next();
                System.out.println("Unesite email adresu");
        String email =scanner.next();
        System.out.println("Unesite jmbg");
        String jmbg=scanner.next();


        System.out.println("IME "+"   " + ime);
        System.out.println("PREZIME" +"   "+ prezime);
                System.out.println("Broj"+ "    " + broj);
        System.out.println("Email" +"    "+ email);
        System.out.println("JMBG" +"   "+jmbg);
    }
}
