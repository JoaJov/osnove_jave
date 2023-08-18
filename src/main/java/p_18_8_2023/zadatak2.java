package p_18_8_2023;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite a");
        int a=s.nextInt();
        if (a<10){
            System.out.println("Jednocifren broj");

        } else if (a<100){
            System.out.println("Dvocifren broj");
        }else if (a<1000){
            System.out.println("Trocifren broj");
        }

    }
}
