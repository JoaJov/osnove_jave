package p_25_8_2023;

public class zadatak7 {
    public static void main(String[] args) {

        int a=5;
        int b=10;
        int c=15;

        boolean valid=pravougliTrougao(a,b,c);
                System.out.println("Trougao je pravougli");
    }
public static boolean pravougliTrougao(int a, int b, int c){
        if (a*a+b*b==c*c){
            return true;

        }else {
            return false;
        }
}

}
