package p_19_9_2023;

public class zadatak2 {
    public static void main(String[] args) {
Disciplina disciplina=new Disciplina("Skok u dalj","Skakacka", "Jovana Jovanovic");

Trkac trkac1=new Trkac("Nikola Nikolic", 3.5);
Trkac trkac2=new Trkac("Veljko Veljkovic", 5.4);

Skakac skakac1=new Skakac("Ilija Jovanovic", 7);
Skakac skakac2=new Skakac("Zoran Stojanovic", 10);

disciplina.dodajAtleticara(trkac1);
disciplina.dodajAtleticara(trkac2);
disciplina.dodajAtleticara(skakac1);
disciplina.dodajAtleticara(skakac2);

skakac1.stampaj();
skakac2.stampaj();
trkac1.stampaj();
trkac2.stampaj();

    }

}
