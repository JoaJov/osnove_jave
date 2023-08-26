package d_24_8_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class domaci5 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        Scanner s=new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
        }numbers.add(s.nextInt());

 System.out.println("Unesite X: ");
    int x = s.nextInt();
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == x){
                System.out.print(i + ",");
}
        }
    }
}


