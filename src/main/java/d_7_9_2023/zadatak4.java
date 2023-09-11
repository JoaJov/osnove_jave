package d_7_9_2023;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Film a=new Film();
       System.out.println("Unesite naslov:");
        a.naslov=s.next();
        System.out.println("Unesite godinu izdanja:");
        a.godIzdanja=s.nextInt();
        System.out.println("Unesite rezisera:");
        a.reziser=s.next();

        Film b=new Film();
        System.out.println("Unesite naslov:");
        b.naslov=s.next();
        System.out.println("Unesite godinu izdanja:");
        b.godIzdanja=s.nextInt();
        System.out.println("Unesite rezisera:");
        b.reziser=s.next();

        Film c=new Film();
        System.out.println("Unesite naslov:");
        c.naslov=s.next();
        System.out.println("Unesite godinu izdanja:");
        c.godIzdanja=s.nextInt();
        System.out.println("Unesite rezisera:");
        c.reziser=s.next();

        System.out.println("Film:"+ a.naslov + ","+ a.godIzdanja + ","+ a.reziser);
        System.out.println("Film:"+ b.naslov + ","+ b.godIzdanja + ","+ b.reziser);
        System.out.println("Film:"+ c.naslov + ","+ c.godIzdanja + ","+ c.reziser);


    }
}
