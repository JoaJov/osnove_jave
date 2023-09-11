package d_7_9_2023;

public class zadatak1 {
    public static void main(String[] args) {
        Student a=new Student();
        a.ime="Jovana Jovanovic";
        a.index=123;
        a.fakultet="Ekonomski fakultet";

        Student b=new Student();
        b.ime="Pera Peric";
        b.index=321;
        b.fakultet="Fakultet politickih nauka";

        Student c=new Student();
        c.ime="Nikola Nikolic";
        c.index=1234;
        c.fakultet="Zastita na radu";

        System.out.println("Student:"+ a.ime +","+ a.index + ","+a.fakultet);
        System.out.println("Student:"+ b.ime +","+ b.index + ","+b.fakultet);
        System.out.println("Student:"+ c.ime +","+ c.index + ","+c.fakultet);
    }
}
