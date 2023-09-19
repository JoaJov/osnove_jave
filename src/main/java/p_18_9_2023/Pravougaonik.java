package p_18_9_2023;

public class Pravougaonik extends Figura {
    private double a;
    private double b;

    public Pravougaonik() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
@Override
    public double povrsina(){
        double povrsina=0;
        povrsina=a *b;
        return povrsina;
    }
    @Override
    public double obim(){
        double obim=0;
        obim=(a*a)+(b*b);
        return obim;
        }
    }

