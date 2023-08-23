package d_22_8_2023;

import java.util.Scanner;

public class domaci1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean max=false;
        int suma=0;
        while(!max){
            System.out.println("Unesite vrednost");
            int x=s.nextInt();

            if ((suma+x)>100) {
                System.out.println("Max");
                max=true;
            }else {
                suma = suma + x;
            }
        }
    }
}
