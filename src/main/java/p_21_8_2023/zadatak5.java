package p_21_8_2023;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite N");
        int n= s.nextInt();

         int suma=0;

         for (int i=1; i<=n; i++){
            System.out.println("Unesite broj");
            int broj=s.nextInt();
            suma=suma+i;

        }
        System.out.println("SUMA"+ suma);

    }
}
