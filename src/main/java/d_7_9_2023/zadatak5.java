package d_7_9_2023;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Oprema a=new Oprema();
        a.tip=s.next();
        a.marka=s.next();
        a.cena=s.nextDouble();

        Oprema b=new Oprema();
        b.tip=s.next();
        b.marka=s.next();
        b.cena=s.nextDouble();

        Oprema c=new Oprema();
        c.tip=s.next();
        c.marka=s.next();
        c.cena=s.nextDouble();

        System.out.println("Oprema:"+ a.tip + ","+ a.marka + "," + a.cena);
        System.out.println("Oprema:"+ b.tip + ","+ b.marka + "," + b.cena);
        System.out.println("Oprema:"+ c.tip + ","+ c.marka + "," + c.cena);
    }
}
