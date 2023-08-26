package d_24_8_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class domaci2 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite N");
        int n= s.nextInt();

        for (int i = 0; i <n; i++){
            System.out.print("Unesite broj");
         numbers.add(s.nextInt());
    }
int brojac=0;
for (int i=0; i<numbers.size(); i++){
if(numbers.get(i)%2==0){
    brojac=brojac+1;
}
}
    System.out.println("Parnih brojeva ima "+brojac);
    }
}



