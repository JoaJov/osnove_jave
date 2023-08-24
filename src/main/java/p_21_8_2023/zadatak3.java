package p_21_8_2023;

public class zadatak3 {
    public static void main(String[] args) {
String broj="....";
        for (int i=1; i<10; i++){
            if (i%2==0){
                broj=broj+i;

            }else if (i%2 !=0){
                broj=i+ broj;
            }
System.out.println(broj);
        }
    }
}
