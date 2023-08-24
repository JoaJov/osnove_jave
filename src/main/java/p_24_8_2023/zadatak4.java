package p_24_8_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers= new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite poziciju 3");
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
      int k=s.nextInt();
        int x=numbers.get(k);
     System.out.println("Uneto je na poziciji "+k +"broj" +x);



        System.out.println("Kraj");
    }


}
