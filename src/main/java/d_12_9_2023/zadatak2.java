package d_12_9_2023;

import java.util.ArrayList;

public class zadatak2 {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton>ispiti=new ArrayList<>();
        int suma=0;

        ispiti.add(new ZeleniKarton("Jovana Jovanovic","123","Kriminalistika",9));
        ispiti.add(new ZeleniKarton("Maja Markovic", "321","Poslovno pravo",6));
        ispiti.add(new ZeleniKarton("Nikola Djordjevic", "345","Krivicno pravo",8));
        ispiti.add(new ZeleniKarton("Petar Petrovic", "222", "Osnove Bezbednosti", 7));
        ispiti.add(new ZeleniKarton("Stefan Sefanovic", "665", "Javna Bezbednost",5));

        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampaj();
        }
        for (int i = 0; i < ispiti.size(); i++) {
            suma = suma + ispiti.get(i).getOcena();
        }
    }
}
