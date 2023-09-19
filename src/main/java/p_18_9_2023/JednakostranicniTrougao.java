package p_18_9_2023;

public class JednakostranicniTrougao extends Figura{
    private double a;

    public JednakostranicniTrougao() {
    }

    public JednakostranicniTrougao(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    @Override
     public  double povrsina(){
        double povrsina=0;
        povrsina=  ((a * a) * 1.73205 / 4);


         return povrsina;
     }
     @Override
     public double obim(){
        double obim=0;
        obim=  (a*a*a);
        return obim;


     }
}
