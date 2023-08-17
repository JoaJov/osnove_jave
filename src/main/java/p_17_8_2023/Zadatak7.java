package p_17_8_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite broj telefona");
        String broj1=s.next();
        System.out.println("Unesite broj telefona");
        String broj2=s.next();

        if (!broj1.equals("+381")) {
            System.out.println("Broj 1 nije validan");
            if (!broj2.contains("/")) {
                System.out.println("Broj 2 nije validan");
            }
        }

    }
}
