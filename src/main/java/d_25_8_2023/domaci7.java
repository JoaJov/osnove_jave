package d_25_8_2023;

public class domaci7 {
    public static void main(String[] args) {
        System.out.println(najmanjiBroj(4,6,1));
        System.out.println(najmanjiBroj(4,6,33));
    }
    public static int najmanjiBroj (int a, int b, int c){
        int najmanji = a;
        if (b < najmanji) najmanji = b;
        if (c < najmanji) najmanji = c;
        return najmanji;
    }
}
