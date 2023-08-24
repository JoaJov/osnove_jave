package p_21_8_2023;

import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite n");
        int n=s.nextInt();
        int brojac=0;

        for (int i=0; i<n;i++){
            System.out.println("Unesite broj");
            int broj=s.nextInt();
            if(broj%2==0){
            brojac=brojac +1;
            }

    }
        System.out.println("Broj parnih je"+ brojac);
    }


}
