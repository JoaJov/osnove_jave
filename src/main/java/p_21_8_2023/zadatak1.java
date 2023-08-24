package p_21_8_2023;

public class zadatak1 {
    public static void main(String[] args) {
        int suma=0;

        for (int i=1; i<=50; i++){
          if (i%2==0)
            suma=suma+i;

        }
        System.out.print("Suma"+suma);
    }
}
