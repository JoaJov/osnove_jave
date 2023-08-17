package p_17_8_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite dan");
        int dan=s.nextInt();
        System.out.println("Unesite mesec");
       int mesec=s.nextInt();
        System.out.println("Unesite godinu");
        int god=s.nextInt();
        System.out.println( dan + "-"+ mesec +"-"+god);


    }
}
