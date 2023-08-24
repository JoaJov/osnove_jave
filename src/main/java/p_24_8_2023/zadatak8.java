package p_24_8_2023;

import java.util.ArrayList;

public class zadatak8 {
    public static void main(String[] args) {
        ArrayList<String>registracija=new ArrayList<>();
        registracija.add("First Name");
        registracija.add("Last Name");
        registracija.add("email");
        registracija.add("password");
        registracija.add("phone");
        registracija.add("address");

        ArrayList<Boolean>valid=new ArrayList<>();
        valid.add(true);
        valid.add(true);
        valid.add(true);
        valid.add(true);
        valid.add(false);
        valid.add(false);



        for (int i=0; i<registracija.size(); i++){
            System.out.print(registracija.get(i)+":");
        if (valid.get(i)==true){
            System.out.println("*");
            
        }
System.out.println("____________");

    }

    }

    }

