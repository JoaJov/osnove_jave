package p_15_9_2023;

public class zadatak1 {
    public static void main(String[] args) {

       Student student1=new Student("Marko Markovic", "1234");
       Student student2=new Student("Jovana Jovanovic", "123");

       Profesor profesor1=new Profesor("Milos Milosevic", "3333", "Kriminalistika");
       Profesor profesor2=new Profesor("Bezbednost", 3333333);

       student1.stampaj();
       student2.stampaj();

       profesor1.stampaj();
       profesor2.stampaj();
    }
}
