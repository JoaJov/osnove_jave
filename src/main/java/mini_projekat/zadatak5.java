package mini_projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite duzinu passworda");
        int duzinaPassworda= s.nextInt();

        System.out.println("Da li zelite specijalan karakter");
        boolean specijalK=s.nextBoolean();

        generisiPassword(duzinaPassworda, specijalK);

    }
public static void generisiPassword(int duzinaPassworda, boolean specijalK){
        String password="";
        if (specijalK){
            for (int i=0; i<duzinaPassworda -1; i++){
                password += generisiRandomK();
            }
            password = password + generisiRandomSpecijalanK();
        }else {
                for (int i = 0; i < duzinaPassworda; i++) {
                    password+= generisiRandomK();

        }
             }
            System.out.println("Password: " + password);

        }

    private static String generisiRandomSpecijalanK() {
    }

    public static String generisiRandomK(){
        Random random =new Random();
        ArrayList<String>niz=new ArrayList<>();
        niz.add("A");
                niz.add("a");
                niz.add("C");
                niz.add("d");
                niz.add("4");
                niz.add("7");
                niz.add("6");
                String karakter=niz.get(random.nextInt(niz.size()));
                return karakter;
    }
    public static String generisiRandomK() {


    }
    public static String generisiRandomSpecijalanK(){
        Random random = new Random();
        ArrayList<String> specijalniKarakteri = new ArrayList<>();
        specijalniKarakteri.add("*");
        specijalniKarakteri.add("%");
        specijalniKarakteri.add("|");
        specijalniKarakteri.add("&");
        specijalniKarakteri.add("$");
        specijalniKarakteri.add("?");
        specijalniKarakteri.add("=");

        String specijalK=specijalniKarakteri.get(random.nextInt(specijalniKarakteri.size()));
        return specijalK;

    }
}
