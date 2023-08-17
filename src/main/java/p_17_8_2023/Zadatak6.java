package p_17_8_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite a");
        int a=s.nextInt();
        System.out.println("Unesite b");
        int b=s.nextInt();
        System.out.println("Unesite c");
        int c =s.nextInt();

        if (a<0) {
            System.out.println("Broj"+a+ "je validan");}
        if (b<0) {
        System.out.println("Broj"+b +"je validan");}
        if (c<0) {
     System.out.println("Broj"+ c +"je validan");}
    }
}



