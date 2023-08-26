package p_25_8_2023;

public class zadatak4 {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;


        printNumber(a, b);
        System.out.println();
        printNumber(10,3);

    }

    public static void printNumber(int prviBroj, int drugiBroj) {
        int proizvod = prviBroj * drugiBroj;
        int razlika = prviBroj - drugiBroj;
        int kolicnik = prviBroj / drugiBroj;
        int sabiranje=prviBroj +drugiBroj;
        System.out.println("Proizvod je" +proizvod);
        System.out.println("Razlika je" +razlika);
        System.out.println("Kolicnhik je" +kolicnik);
        System.out.println("Sabiranje" +sabiranje);
    }




}

