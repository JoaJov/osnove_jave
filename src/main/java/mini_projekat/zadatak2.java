package mini_projekat;

import java.util.ArrayList;

public class zadatak2 {
    public static void main(String[] args) {
        ArrayList<String>fullName=new ArrayList<>();

        fullName.add("Pera Peric");
        fullName.add("Marko Markovic");
        fullName.add("Stefan Stefanovic");
        fullName.add("Milan Milanovic");
        fullName.add("Darko Darkovic");
        fullName.add("Uros Urosevic");

        ArrayList<Boolean> active=new ArrayList<>();
        active.add(true);
        active.add(true);
        active.add(true);
        active.add(true);
        active.add(false);
        active.add(false);

        for (int i =0; i < active.size(); i ++){
            if (active.get(i) == true) {
                System.out.println("| slika |o " + fullName.get(i));
            }
        }
        for (int i =0; i < active.size(); i ++){
            if (active.get(i) == false) {
                System.out.println("| slika |x " + fullName.get(i));
    }
}
    }
}