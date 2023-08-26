package d_24_8_2023;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class domaci1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        System.out.println("Unesite poziciju od 0 do 9");
        int k=s.nextInt();
        System.out.println("Unesite novu vrednost");
        int vrednost=s.nextInt();
        numbers.set(k, vrednost);
    }
}
