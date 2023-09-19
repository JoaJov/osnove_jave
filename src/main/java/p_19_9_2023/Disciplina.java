package p_19_9_2023;

import java.util.ArrayList;

public class Disciplina extends Object {
    private String imeDiscipline;
    private String tipDiscipline;
private ArrayList<Atleticar>atleticari=new ArrayList<>();

    public Disciplina(String imeDiscipline, String tipDisciplinei, String imeIprezime) {
        super();
        this.imeDiscipline = imeDiscipline;

    }

    public Disciplina() {
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(ArrayList<Atleticar> atleticari) {
        this.atleticari = atleticari;
    }
    public void dodajAtleticara(Atleticar atleticar){
        atleticari.add(atleticar);
    }
    public void diskvalifikujAtleticara(String imeIprezime){
    for (int i=0; i <atleticari.size(); i++){
        if (atleticari.get(i).getImeIprezime().equals(imeIprezime)){

    }
        private Atleticar najboljiRezultat(){
            Atleticar najbolji=this.atleticari.get(0);
            for (int i=1; i< this.atleticari.size(); i++){
                if (this.atleticari.get(i).rezultatAteticara(najbolji)){
                   najbolji=this.atleticari.get(i);
                }
            }

                    return najbolji;
                }
            }



                }
            }

            }
        }



