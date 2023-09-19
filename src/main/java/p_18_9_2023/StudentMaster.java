package p_18_9_2023;

public class StudentMaster extends Student {


public StudentMaster(String imeIprezime, int brojIndexa, int godStudija){
        super(imeIprezime,brojIndexa,godStudija);

}
@Override
public int skolarina(){
        return 100000;

}
@Override
public boolean budzet(){
        if (this.godStudija <2){
            return true;
        }
        return false;
}
}