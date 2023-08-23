package d_22_8_2023;

import java.util.Scanner;

public class domaci4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite broj");
        int brojac=0;
        int brojacdva=0;

        while (brojac !=3 && brojacdva !=2){
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj==1)
                brojac=brojac+1;
              else if (broj==2) {
                    brojacdva=brojacdva+1;
                }
              System.out.println("kraj");
            }

        }


    }
}
