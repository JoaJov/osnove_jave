package d_21_8_2023;

import java.util.Scanner;

public class domaci3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int agresivnost = 0;

        int uzvicnik = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite tekst: ");
            String rec= s.next();

            if (rec.contains("!")) {
                uzvicnik = uzvicnik + 1;
                System.out.println(rec);
            } else {
                System.out.println(rec + "!");
            }

        }

        agresivnost = uzvicnik * 100 / n;
        System.out.println("Nivo agresivnosti: " + agresivnost + "%");


    }
}
