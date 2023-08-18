package p_18_8_2023;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
       System.out.println("Unesite N");
        int n= s.nextInt();
        String akcija =s.next();

        if (akcija.equals("povecaj")){
        n=n+1;
        System.out.println(n+1);
        }

        if (akcija.equals("smanji")){
            n=n-1;
        System.out.println(n-1);
        }
            }

    }

