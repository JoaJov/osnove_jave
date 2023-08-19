package d_17_8_2023;

import java.util.Scanner;

public class domaci5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite a");
        int a=s.nextInt();
        System.out.println("Unesite b");
        int b=s.nextInt();
        System.out.println("Unesite znak");
        String znak=s.next();
        int rezultat=0;



        if(znak.equals("-")){
            rezultat=a-b;
        }else if (znak.equals("*")) {
            rezultat = a * b;
        }else if (znak.equals("/")){
            rezultat = a / b;
        } else if (znak.equals("+")) {
            rezultat=a+b;



        }

    }
}
