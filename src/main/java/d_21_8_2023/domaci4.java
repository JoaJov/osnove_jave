package d_21_8_2023;

import java.util.Scanner;

public class domaci4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite broj reakcija: ");
        int n = s.nextInt();

        int like = 0;
        int smile = 0;
        int heart = 0;

        int summ = 0;

        for (int i = 0; i < n ; i++) {
            System.out.println("Unesite reakciju: ");
            String rec = s.next();

            if ( rec.equals("like")) {
                summ = summ + 1;
            } else if (rec.equals("smile")) {
                summ = summ + 1;
            } else if (rec.equals("heart")) {
                summ = summ + 1;
            }
            System.out.println("Broj reakcije je: " + summ);
        }
    }
}
