package p_15_9_2023;

public class Student extends Osoba {
    private String brojIndexa;
    private double dugSkolarine;

    public Student(String imeIprezime, String jmbg) {
        super(imeIprezime, jmbg);
    }
    public Student(){
        super();
    }


    public void uplatiSkolarinu(double uplata)  {
        this.dugSkolarine=this.dugSkolarine - uplata;

    }
    @Override
    public void stampaj(){
        System.out.println("Student");
        super.stampaj();
        System.out.println("Index" + this.brojIndexa);
        System.out.println("Dug skolarine" +this.dugSkolarine);

    }

    }

