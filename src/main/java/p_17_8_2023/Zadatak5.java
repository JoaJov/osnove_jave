package p_17_8_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite a");
        int a=s.nextInt();
        System.out.println("Unesite b");
        int b=s.nextInt();
                System.out.println("Unesite c");
        int c=s.nextInt();
        if (a>=b && a<=c) {
            System.out.println("A je u opsegu b i c");
        }
    }
}
