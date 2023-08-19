package d_18_8_2023;

import java.util.Scanner;

public class domaci1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite X");
        int x=s.nextInt();
        int y=0;

        if(x<2) {
            y=x;
    }else if (x>2){
            y=x-1;
        } else if (x>=10) {
            y=x=2;
            System.out.println(y);
            
        }
    }
}
