package d_18_9_2023;

public class AudioControl extends Control{
    private boolean jacinaZvuka;

    public AudioControl() {
    }

    public AudioControl(boolean jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public boolean isJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(boolean jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
        if (jacinaZvuka){
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() +1);
            if (videoPlayer.getJacinaZvuka() >100){
                videoPlayer.setJacinaZvuka(100);
            }
        }else{
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() -1);
            if (videoPlayer.getJacinaZvuka() < 0) {
               videoPlayer.setJacinaZvuka(0);
        }
    }
    }
}
