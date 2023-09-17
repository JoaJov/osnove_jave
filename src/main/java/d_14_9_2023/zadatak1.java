package d_14_9_2023;

public class zadatak1 {
    public static void main(String[] args) {
        Ispit ispit1 = new Ispit("Krivicno pravo", 10, "Tatjana Skakavac");
        Ispit ispit2 = new Ispit("Kriminalistika", 8, "Zdravko Skakavac");
        Ispit ispit3 = new Ispit("Osnovi bezbednsoti", 7, "Milan Danicic");
        Ispit ispit4=new Ispit("Pshilogija", 5, "Jelena Jankovic");

        Student student=new Student("1234", "Jovana Jovanovic", "osnovne studije");
        student.dodajIspit(ispit1);
        student.dodajIspit(ispit2);
        student.dodajIspit(ispit3);
        student.dodajIspit(ispit4);

        student.stampaj();


    }
}
