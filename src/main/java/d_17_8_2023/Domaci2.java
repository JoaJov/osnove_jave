package d_17_8_2023;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite a");
        int a=s.nextInt();
        System.out.println("Unesite b");
        int b=s.nextInt();

        if (b==1){
            a=a+10;
            if (b==2){
                a=a-20;
                System.out.println("a = "+  a);
        }
    }
    }
}

