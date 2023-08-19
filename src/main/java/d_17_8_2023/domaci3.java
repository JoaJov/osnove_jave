package d_17_8_2023;

import java.util.Scanner;

public class domaci3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter actual url:");
        String actual = s.next();

        System.out.println("Enter expected url:");
        String expected = s.next();

        System.out.println("Enter error code:");
        String error = s.next();

        if(actual.equals(expected)) {
            System.out.println("1 Test passed.");
        } else {
            System.out.println("Assertion Error: Expected google.com/home but got google.com/ivalid_login, error code:  URL_MISSMATCH");
        }
    }
}
