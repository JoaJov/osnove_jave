package d_25_8_2023;

import java.util.Scanner;

public class domaci1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite vrednost:");
        int vrednost = s.nextInt();

        printVrednostZa10Vecu(vrednost);
    }

    public static void printVrednostZa10Vecu(int broj) {

        System.out.println("Vrednost " + broj + " uvecana za 10 iznosi: " + (broj + 10));
    }
}
