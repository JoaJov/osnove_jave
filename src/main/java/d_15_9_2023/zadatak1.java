package d_15_9_2023;

public class zadatak1 {
    public static void main(String[] args) {
     Igrac igrac1=new Igrac("Jovana Jovanovic", "12345", 2000, 13,"napadac",true);
     Igrac igrac2=new Igrac("Nikola Nikolic","33333", 1999, 23,"odbrambeni", false);


     Trener trener1=new Trener("Rados Bajic", "6666", 1974, 11,"kondicioni");
     Trener trener2=new Trener("Ljubisa Samardzic", "123-345", 1966, 20, "personalni");


     igrac1.stampaj();
     igrac2.stampaj();

     trener1.stampaj();
     trener2.stampaj();
    }
}
