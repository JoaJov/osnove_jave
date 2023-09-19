package p_18_9_2023;

public class StudentOsnovnih extends Student{
    public StudentOsnovnih(String imeIprezime, int index, int godStudija){
        super(imeIprezime, index, godStudija);
    }
    @Override
    public boolean budzet(){
        return this.godStudija <5;
    }
    @Override
    public int skolarina(){
        return 90000;
    }
}
