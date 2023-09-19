package p_18_9_2023;

public class FigureGenerator {


 public Figura generisiFiguru(String tip){
    Figura generisanaFigura = null;
     if (tip.equals("trougao")){
         generisanaFigura=new JednakostranicniTrougao();
     }else if (tip.equals("Pravougaonik")){
         generisanaFigura=new Pravougaonik();
     }
     return generisanaFigura;



 }
}
