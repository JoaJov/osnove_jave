package p_24_8_2023;

import java.util.ArrayList;

public class zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int x=numbers.size()-1;

    int suma=numbers.get(4);
    System.out.println("suma je:"+suma);
}
}