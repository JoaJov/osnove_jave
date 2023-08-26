package d_25_8_2023;

import java.util.Scanner;

public class domaci2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        String prviBroj = s.next();
        System.out.println("Unesite drugi broj:");
        String drugiBroj = s.next();
        String novaVrednost = printDvocifrenBroj(prviBroj, drugiBroj);
        System.out.println("Nova vrednost iznosi " + novaVrednost);
    }

    public static String printDvocifrenBroj (String a, String b) {

        String dvocifrenBroj = a + b;
        return dvocifrenBroj;
}
}


