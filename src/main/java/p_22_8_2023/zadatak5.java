package p_22_8_2023;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite expected results");
        String expected=s.next();
        System.out.println("Unesite actual results");
        String actual=s.next();
int test=0;
        boolean isValid=true;


while (isValid==true && test<5){

    System.out.println("Unesite expected results");
    expected=s.next();
    System.out.println("Unesite actual results");
    actual=s.next();
       test=test+1;
       if (!expected.equals(actual)){
           isValid=false;
           System.out.println("Test failed");
       }
       if (isValid==true && test==5){
           System.out.println("Test pass");
       }



}

    }
}
