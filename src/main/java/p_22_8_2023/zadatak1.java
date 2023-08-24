package p_22_8_2023;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

   System.out.println("Unesite broj");
   int broj=s.nextInt();
   while (broj<10|| broj>50){
       System.out.println("Pogrsan broj"+broj+ "nije u opsegu");
       System.out.println("Unesite broj");
       broj=s.nextInt();



        }
        System.out.println("Kraj");
    }
}
