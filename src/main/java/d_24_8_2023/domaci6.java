package d_24_8_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class domaci6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> link = new ArrayList<>();
        ArrayList<Integer> nizExpected = new ArrayList<>();
        ArrayList<Integer> nizActual = new ArrayList<>();

        link.add("https://cms.demo.katalon.com/cart/");
        link.add("https://cms.demo.katalon.com/shop/");
       link.add("https://cms.demo.katalon.com/account/");
        link.add("https://cms.demo.katalon.com/cart/");
        link.add("https://cms.demo.katalon.com/test/");

        nizExpected.add(200);
        nizExpected.add(200);
        nizExpected.add(404);
        nizExpected.add(204);
        nizExpected.add(200);

        nizActual.add(200);
        nizActual.add(200);
        nizActual.add(400);
        nizActual.add(200);
        nizActual.add(404);

        for (int i = 0; i < link.size(); i++) {
            if (!nizExpected.get(i).equals(nizActual.get(i))){
                System.out.println("Assertion Error: " + link.get(i) +
                        " expected " + nizExpected.get(i) + " but got " + nizActual.get(i));
    }
}
    }
}