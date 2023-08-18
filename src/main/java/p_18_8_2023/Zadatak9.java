package p_18_8_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite A");
        int a=s.nextInt();
        System.out.println("Unesite B");
        int b=s.nextInt();

        for(int i=1; i<11; i++){


            if (i !=a && i!=b){
                System.out.print(i+",");
            }
    }
}
}

