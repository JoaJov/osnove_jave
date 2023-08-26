package d_24_8_2023;

import java.util.ArrayList;

public class domaci3 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        for (int i = numbers.size()-1; i >= 0 ; i--) {
            System.out.print(numbers.get(i));
            if (i != 0){
                System.out.print(",");
            }
    }
}
}
