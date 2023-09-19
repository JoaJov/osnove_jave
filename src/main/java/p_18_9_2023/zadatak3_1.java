package p_18_9_2023;

public class zadatak3_1 {
    public static void main(String[] args) {
        FigureGenerator generator=new FigureGenerator();
        Figura t1= generator.generisiFiguru("Trougao");
        Figura t2= generator.generisiFiguru("trougao");
        Figura p1= generator.generisiFiguru("Pravougaonik");
        Figura p2= generator.generisiFiguru("Trougao");
    }
}
