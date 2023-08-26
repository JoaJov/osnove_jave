package d_25_8_2023;

public class domaci6 {
    public static void main(String[] args) {
        System.out.println(" Rezultat: " + broji(5, 10));
        System.out.println("Rezultat: " + broji(-5, 1));
    }

    public static int broji(int m, int n) {
        int brojac = 0;
        for (int i = m; i<= n; i++) {
            brojac=brojac+1;
        }
        return brojac;
    }
}
