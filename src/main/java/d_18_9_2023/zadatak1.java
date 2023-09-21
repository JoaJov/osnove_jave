package d_18_9_2023;

public class zadatak1 {
    public static void main(String[] args) {
     VideoPlayer videoPlayer=new VideoPlayer(30,10,40,360);
     TimeControl timeControl=new TimeControl(true);
     AudioControl audioControl=new AudioControl(false);
     QualityOptimizerControl qualityOptimizerControl=new QualityOptimizerControl(20);

     timeControl.izvrsiAkciju(videoPlayer);
     audioControl.izvrsiAkciju(videoPlayer);
     qualityOptimizerControl.izvrsiAkciju(videoPlayer);

     videoPlayer.stampaj();

    }
}
