package p_24_8_2023;

import java.util.ArrayList;

public class zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.set(3, numbers.get(3) * 10);
        System.out.println("Vrednost je povecana");
    }

    public static class zadatak3 {
        public static void main(String[] args) {
            ArrayList<Integer>numbers=new ArrayList<>();

            int y= numbers.get(0);
            int x=numbers.get(numbers.size()-1);
    numbers.set(0, y);
    numbers.set(numbers.size()-1, x);
        }
    }
}
