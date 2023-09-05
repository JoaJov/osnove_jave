package mini_projekat;

import java.util.ArrayList;

public class zadatak3 {
    public static void main(String[] args) {

        String sql = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) " +
                "VALUES ('%0', '%1', '%2', '%3', '%4', '%5');";

        ArrayList<String>nazivi=new ArrayList<>();

        nazivi.add("Cardinal");
        nazivi.add("Tom B. Erichsen");
        nazivi.add("Skagen 21");
        nazivi.add("Stavanger");
        nazivi.add("4006");
        nazivi.add("Norway");

        for (int i = 0; i < nazivi.size(); i++) {
            String placeholder = "%" + i;
            sql = sql.replace(placeholder, nazivi.get(i));
        }
        System.out.println(sql);



    }
}
