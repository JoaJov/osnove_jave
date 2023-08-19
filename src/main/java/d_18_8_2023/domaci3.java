package d_18_8_2023;

import java.util.Scanner;

public class domaci3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite x: ");
        int x = s.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
    }
}
}

