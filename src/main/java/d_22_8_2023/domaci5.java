package d_22_8_2023;

import java.util.Scanner;

public class domaci5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int brojac1=0;
        int brojac2=0;
        String input= "";
        while (!input.equals("=")) {
            System.out.println("Uneti:");
            input = s.next();

            if (input.equals("(")) {
                brojac1=brojac1+1;
            }else if (input.equals(")")) {
                    brojac2=brojac2+1;

                }
            }
    if (brojac1==brojac2) {
        System.out.println("Zagrade su uparene.");
    } else {
        System.out.println("Zagrade nisu uparene.");
    }

}
