package mini_projekat;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String komanda="locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE";

        while (komanda.contains("$")){
            System.out.println("Komanda: " + komanda);
            System.out.print("Unesite naziv promenljive za zamenu: ");
            String promenljiva = s.next();
            System.out.println("Uneiste vrednost: ");
            String zamena = s.next();
            komanda = komanda.replace(promenljiva, zamena);

        }
        System.out.println(komanda);
    }
}
