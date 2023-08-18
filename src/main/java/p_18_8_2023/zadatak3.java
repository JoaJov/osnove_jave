package p_18_8_2023;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite a");
        int a =s.nextInt();
        String operacija=s.next();

        if (a%3==0){
            System.out.println("Deljiv sa tri");
        }else if (a%2==0){
            System.out.println("Deljiv sa 2");
        }

    }
}
