package d_22_8_2023;

import java.util.Scanner;

public class domaci2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int broj = 1;

        while (broj!=0) {
            System.out.println("Unesite broj:");
            broj = s.nextInt();

            if (broj > 0) {
                System.out.println("Apsolutna vrednost je " + broj);
            } else if (broj < 0){
                System.out.println("Apsolutna vrednost je "  + -broj);
            }
        }
        System.out.println("Kraj programa jer je uneta nula.");
    }
}
