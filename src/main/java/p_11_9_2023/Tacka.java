package p_11_9_2023;

public class Tacka {
    private int x;
    private int y;

    public Tacka(){

    }
    public Tacka(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
    public void stampaj(){
        System.out.println("Koordinate"+this.y+","+ this.x );

    }
}
