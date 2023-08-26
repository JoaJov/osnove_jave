package d_25_8_2023;

import java.util.Scanner;

public class domaci5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite vrednost u evrima: ");
        double vrednost = s.nextDouble();
        System.out.print("Unesite valutu za konverziju: ");
        String valuta = s.next();
        double konvertovanaVrednost = konverzija(vrednost,valuta);
        System.out.println(vrednost + " EUR je " + konvertovanaVrednost + " " + valuta);
    }
    public static double konverzija (double vrednost, String valuta){
        if (valuta.equals("RSD")){
            return vrednost * 117.5;
        }else if (valuta.equals("USD")){
            return vrednost * 1.1;
        }else if (valuta.equals("RUB")){
            return vrednost * 62.98;
        }
        return 0;
    }
}
