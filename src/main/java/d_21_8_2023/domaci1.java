package d_21_8_2023;

import java.util.Scanner;

public class domaci1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite broj N: ");
        int n = s.nextInt();

        int suma = 0;

        for (int i = 0; i < n ; i++) {
            System.out.println("Unesite broj: ");
            int x = s.nextInt();
            if (x%2==0) {
                suma = suma + x;


            }

            System.out.println("Zbir parnih brojeva je:" + suma);
    }
}
}
