package p_18_9_2023;

import java.util.ArrayList;

public class zadatak3 {
    public static void main(String[] args) {

       JednakostranicniTrougao jednakostranicniTrougao=new JednakostranicniTrougao();
       jednakostranicniTrougao.setA(2);

       JednakostranicniTrougao trougao=new JednakostranicniTrougao();
       trougao.setA(4);
       JednakostranicniTrougao trougao1=new JednakostranicniTrougao();
       trougao1.setA(2);

       Pravougaonik pravougaonik=new Pravougaonik();
       pravougaonik.setA(3);
       pravougaonik.setB(6);

       Pravougaonik pravougaonik1=new Pravougaonik();
       pravougaonik1.setA(2);
       pravougaonik1.setB(4);

       Pravougaonik pravougaonik2=new Pravougaonik();
       pravougaonik2.setB(3);
       pravougaonik2.setA(2);

       jednakostranicniTrougao.stampaj();
       pravougaonik.stampaj();

       Figura f;
       f=jednakostranicniTrougao;
       f.stampaj();
       f=pravougaonik;
       f.stampaj();

        ArrayList<Figura>figure=new ArrayList<>();
        figure.add(trougao1);
        figure.add(trougao);
        figure.add(pravougaonik);
        figure.add(pravougaonik1);
        figure.add(pravougaonik2);
        for (int i=0; i<figure.size(); i++){
            figure.get(i).stampaj();
        }
        double povrsine=0;
        double obimi=0;

        for (int i=0; i<figure.size(); i++){
            povrsine=povrsine + figure.get(i);

    }
    }
}

